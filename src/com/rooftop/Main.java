package com.rooftop;

import static java.lang.System.out;

public class Main {

    public static final String URL = "http://";

    public static void main(String[] args) {

        out.println(args[0]);
        out.println("hi!");

        generateValues();

        Service s = new DefaultService();
        s.run();
    }

    private static void generateValues() {
         //TODO
          int value = 0;
        for (int i = 0; i < 10; i++) {
            value += i;
        }
    }
}

