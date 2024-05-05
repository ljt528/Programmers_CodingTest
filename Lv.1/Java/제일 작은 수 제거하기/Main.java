package org.example;

public class Main {
    public int[] main(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int numMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            numMin = Math.min(numMin, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (numMin == arr[i]) {
                continue;
            }
            answer[count++] = arr[i];
        }
        return answer;
    }
}