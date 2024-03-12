package org.example;

public class Main {
    public int main(int a, int b, boolean flag) {
        int answer = flag == true ? a + b : a - b;
        return answer;
    }
}