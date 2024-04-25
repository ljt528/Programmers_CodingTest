package org.example;

public class Main {
    public int main(int num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer ++;

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}