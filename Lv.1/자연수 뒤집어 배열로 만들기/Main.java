package org.example;

import java.util.stream.IntStream;

public class Main {
    public int[] main(long n) {
        String[] saveNumber = String.valueOf(n).split("");
        int[] answer = new int[saveNumber.length];
        for (int i = 0; i < saveNumber.length; i++) {
            answer[i] = Integer.parseInt(saveNumber[saveNumber.length - 1 - i]);
        }
        return answer;


//      return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
        
    }
}