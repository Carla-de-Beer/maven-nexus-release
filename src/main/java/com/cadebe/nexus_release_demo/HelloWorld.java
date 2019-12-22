package com.cadebe.nexus_release_demo;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(sayHello());
    }

    public static String sayHello() {
        return "Hello World, I am publishing artifacts to Nexus and using profiles";
    }
}
