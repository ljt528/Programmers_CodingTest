package org.example;

public class Main {
    public long[] main(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * i + x;
        }
        return answer;
    }
}