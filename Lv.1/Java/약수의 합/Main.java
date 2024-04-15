package org.example;

public class Main {
    public int main(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;

//        n의 제곱근(루트n)까지 반복문
//        int answer = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                answer += i;
//            }
//        }
//        return answer + n;

    }
}