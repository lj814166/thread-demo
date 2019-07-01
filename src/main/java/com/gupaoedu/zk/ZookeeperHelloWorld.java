package com.gupaoedu.zk;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

/**
 * 
 * ZookeeperTest.java Create on 2017年6月10日 下午11:07:02    
 *    
 * 类功能说明:   zookeeper入门
 *
 * Copyright: Copyright(c) 2013 
 * Company: COSHAHO
 * @Version 1.0
 * @Author coshaho
 */
public class ZookeeperHelloWorld 
{
    private static final int TIME_OUT = 3000;
    private static final String HOST = "10.108.29.208:3181";
    public static void main(String[] args) throws Exception
    {
        ZooKeeper zookeeper = new ZooKeeper(HOST, TIME_OUT, null);
        
        // 创建目录/coshaho
        if(zookeeper.exists("/coshaho", false) == null)
        {
            // 参数：目录名称，目录数据，不进行ACL控制，节点为永久性目录
            zookeeper.create("/coshaho", "zookeeper, I'm comming.".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        
        // 查询目录/coshaho数据
        System.out.println("节点/coshaho数据为：" + new String(zookeeper.getData("/coshaho", false, null)));
        
        // 创建目录/coshaho/learn
        if(zookeeper.exists("/coshaho/learn", false) == null)
        {
            zookeeper.create("/coshaho/learn", "Hello, zookeeper.".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        
        // 查询目录/coshaho/learn数据
        System.out.println("节点/coshaho/learn数据为：" + new String(zookeeper.getData("/coshaho/learn", false, null)));
        
        // 修改目录/coshaho/learn数据
        String data = "I have modified node text.";
        zookeeper.setData("/coshaho/learn", data.getBytes(), -1);
        
        // 查询目录/coshaho/learn数据
        System.out.println("修改节点/coshaho/learn数据后：" + new String(zookeeper.getData("/coshaho/learn", false, null)));
        
        // 删除目录
        //zookeeper.delete("/coshaho/learn", -1);

        zookeeper.close();
    } 
}