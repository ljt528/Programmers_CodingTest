package org.example;

public class Main {
    public int main(int[] array) {
        int answer = 0;
        int index = 0;
        int result = 0;
        int[] numberCheck = new int[1000];
        for (int i = 0; i < array.length; i++) {
            numberCheck[array[i]]++;
            if (numberCheck[array[i]] > index) {
                index = numberCheck[array[i]];
                result = array[i];
            } else if (numberCheck[array[i]] == index) {
                result = -1;
            }
        }
        answer = result;
        return answer;
    }
}