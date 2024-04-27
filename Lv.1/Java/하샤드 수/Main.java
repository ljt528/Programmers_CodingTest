package org.example;

public class Main {
    public boolean main(int x) {
        int sum = 0;
        int num = x;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        boolean answer = x % sum == 0 ? true : false;

        return answer;
    }
}