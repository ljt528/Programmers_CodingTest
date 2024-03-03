package org.example;

public class Main {
    public String main(String my_string, String overwrite_string, int s) {
        String[] add1 = my_string.split("");
        String[] add2 = overwrite_string.split("");
        String answer = "";

        for (int i = 0; i < s; i++) {
            answer += add1[i];
        }
        answer += overwrite_string;
        if (add1.length-s < add2.length) {
            for (int i = s+add2.length; i < add1.length; i++) {
                answer += add1[i];
            }
        } else if (add1.length > add2.length+s) {
            for (int i = add2.length+s; i < add1.length; i++) {
                answer += add1[i];
            }
        }

        return answer;
    }
}