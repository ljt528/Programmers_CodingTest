package org.example;

public class Main {
    public int main(int n) {
        String answer = "";

        while (n != 0) {
            answer += n % 3;
            n /= 3;
        }
        return Integer.parseInt(answer, 3);
    }
}