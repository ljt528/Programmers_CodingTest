package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.print(a + b);

//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//
//        String[] apple_pen = a.split("");
//        String[] hello_world = b.split("");
//
//        String result_apple_pen = "";
//        String result_hello_world = "";
//
//        for (int i = 0; i < apple_pen.length; i++) {
//            if (apple_pen[i].equals(" ")) {
//                continue;
//            }
//            result_apple_pen += apple_pen[i];
//        }
//
//        for (int j = 0; j < hello_world.length; j++) {
//            if (hello_world[j].equals(" ")) {
//                continue;
//            }
//            result_hello_world += hello_world[j];
//        }
//
//        System.out.println(result_apple_pen);
//        System.out.println(result_hello_world);
    }
}