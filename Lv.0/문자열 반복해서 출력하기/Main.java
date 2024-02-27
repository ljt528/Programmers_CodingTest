package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int k=1;

        for (k=1; k<=n; k++) {
            System.out.print(str);
        }
    }
}