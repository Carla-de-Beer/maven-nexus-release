package com.cadebe.nexus_release_demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloWorldTest {

    @Test
    void sayHello() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(System.getenv("TEST_HOST"));

        System.out.println(HelloWorld.sayHello());
        assertThat(HelloWorld.sayHello()).isEqualTo("Hello World, I am publishing artifacts to Nexus and using profiles");
    }
}