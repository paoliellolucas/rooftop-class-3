package com.rooftop;

public class DefaultService implements Service {

    @Override
    public void run() {
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
    }

    @Override
    public void runTwo() {
        System.out.println("hI!");
    }
}
