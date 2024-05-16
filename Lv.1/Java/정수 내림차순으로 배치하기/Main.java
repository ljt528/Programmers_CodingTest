package org.example;

public class Main {
    public long main(long n) {
        long answer = 0;
        String str1 = Long.toString(n);
        char[] arr = str1.toCharArray();
        String str2 = new String();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    char cha = arr[i];
                    arr[i] = arr[j];
                    arr[j] = cha;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            str2 += arr[j];
        }
        answer = Long.parseLong(str2);

        return answer;
    }
}