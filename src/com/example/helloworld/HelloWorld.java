package com.example.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HOD on 19. 6. 2014.
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Hello, %s!", s);
    }
}
