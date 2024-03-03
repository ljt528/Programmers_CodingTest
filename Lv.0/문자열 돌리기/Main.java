package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] changer = a.split("");

        for (int i = 0; i < changer.length; i++) {
            System.out.println(changer[i]);
        }

    }
}