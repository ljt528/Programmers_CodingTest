package org.example;

public class Main {
    public int main(int[] numbers) {
        int answer = 0;
        int[] qwer = new int [10];

        for (int i = 0; i < numbers.length; i++) {
            qwer[numbers[i]] = 1;
        }

        for (int j = 0; j < qwer.length; j++) {
            if (qwer[j] == 0) {
                answer += j;
            }
        }
        return answer;
    }
}