package org.example;

public class Main {
    public long main(long n) {
        long answer = 0;
        while (answer * answer < n) {
            answer ++;
        } if (answer * answer == n) {
            answer = (answer + 1)*(answer + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}