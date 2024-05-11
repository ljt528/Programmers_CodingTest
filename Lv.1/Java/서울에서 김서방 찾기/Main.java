package org.example;

public class Main {
    public String main(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "  + i + "에 있다";
            }
        }

        return answer;
    }
}