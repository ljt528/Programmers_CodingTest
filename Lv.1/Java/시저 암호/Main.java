package org.example;

public class Main {
    public String main(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            int asciiCount = word + n;

            if (word == ' ') {
                answer += word;
            } else if (word >= 'A' && word <= 'Z') {
                if (asciiCount > 'Z') {
                    asciiCount -= 26;
                }
                answer += (char) asciiCount;
            } else {
                if (asciiCount > 'z') {
                    asciiCount -= 26;
                }
                answer += (char) asciiCount;
            }
        }
        return answer;
    }
}