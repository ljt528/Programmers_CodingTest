package org.example;

import java.util.Arrays;

public class Main {
    public int main(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (result + d[i] <= budget) {
                result += d[i];
                answer++;
            }
        }
        return answer;
    }
}