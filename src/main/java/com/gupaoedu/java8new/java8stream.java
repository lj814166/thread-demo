package com.gupaoedu.java8new;

import java.util.Arrays;

public class java8stream {
    public static void main(String[] args) {
        String[] names = { "Fred Edwards", "Anna Cox", "Deborah Patterson", "Ruth Torres", "Shawn Powell",
                "Rose Thompson", "Rachel Barnes", "Eugene Ramirez", "Earl Flores", "Janice Reed", "Sarah Miller",
                "Patricia Kelly", "Carl Hall", "Craig Wright", "Martha Phillips", "Thomas Howard", "Steve Martinez",
                "Diana Bailey", "Kathleen Hughes", "Russell Anderson", "Theresa Perry" };
        Arrays.asList(names)
                .stream()
                .sorted().map(String::toUpperCase).forEach(System.out::println);
    }
}
