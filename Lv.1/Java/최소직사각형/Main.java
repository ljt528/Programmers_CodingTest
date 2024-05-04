package org.example;

public class Main {
    public int main(int[][] sizes) {
        int answer = 0;
        int sqrMax = 0;
        int sqrMin = 0;

        for (int[] size : sizes) {
            int numMax = Math.max(size[0], size[1]);
            int numMin = Math.min(size[0], size[1]);

            sqrMax = Math.max(numMax, sqrMax);
            sqrMin = Math.max(numMin, sqrMin);
        }
        answer = sqrMax * sqrMin;

        return answer;
    }
}