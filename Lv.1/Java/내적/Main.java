package org.example;

public class Main {
    public int main(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}