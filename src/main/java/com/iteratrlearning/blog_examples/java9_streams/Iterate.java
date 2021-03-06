package com.iteratrlearning.blog_examples.java9_streams;

import java.util.stream.Stream;

public class Iterate
{
    public static void main(String[] args)
    {
        // 1. Show that it never terminates
        // 2. use new iterate with filter method

        Stream.iterate(3, x -> x + 3)
              .filter(x -> x < 100)
              .forEach(System.out::println);
    }

}
