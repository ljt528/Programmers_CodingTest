package org.example;

public class Main {
    public int[] main(int n, int m) {
        int maxNum = Math.max(n, m);
        int minNum = Math.min(n, m);

        // 최대 공약수
        while (minNum != 0) {
            int abc = maxNum % minNum;
            maxNum = minNum;
            minNum = abc;
        }

        // 최소 공배수
        int def = n * m / maxNum;

        int[] answer = {maxNum, def};
        return answer;
    }
}