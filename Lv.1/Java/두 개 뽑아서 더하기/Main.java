package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public int[] main(int[] numbers) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!numList.contains(sum)) {
                    numList.add(sum);
                }
            }
        }
        int[] answer = new int[numList.size()];
        for (int k = 0; k < numList.size(); k++) {
            answer[k] = numList.get(k);
        }
        Arrays.sort(answer);
        return answer;
    }
}