package org.example;

public class Main {
    public long main(int a, int b) {
        long answer = 0;
        if (a == b) {
            answer = a;
        } else {
            if (a < b) {
                for (int i = a; i < b + 1; i++) {
                    answer += i;
                }
            } else {
                for (int i = b; i < a + 1; i++) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}