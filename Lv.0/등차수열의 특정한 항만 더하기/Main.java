package org.example;

public class Main {
    public int main(int a, int d, boolean[] included) {
        int answer = 0;
        int[] qwer = new int[100];
        for (int i = 0; i < included.length; i++) {
            qwer[i] = a + i * d;
        }
        for (int j = 0; j < included.length; j++) {
            if (included[j]) {
                answer += qwer[j];
            }
        }
        return answer;
    }
}