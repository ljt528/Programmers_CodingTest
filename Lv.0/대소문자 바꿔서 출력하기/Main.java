package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String result = "";
        for (char asdf : a.toCharArray()) {
            if (Character.isLowerCase(asdf)) {
                result += Character.toUpperCase(asdf);
            } else {
                result += Character.toLowerCase(asdf);
            }
        }
        System.out.print(result);
    }
}