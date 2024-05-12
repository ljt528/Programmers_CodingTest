package org.example;

public class Main {
    public String main(String s) {
        String answer = "";
        String[] sentence = s.split("");

        int index = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                sentence[i] = sentence[i].toUpperCase();
                index++;
            } else {
                sentence[i] = sentence[i].toLowerCase();
                index++;
            }
            answer += sentence[i];
        }
        return answer;
    }
}