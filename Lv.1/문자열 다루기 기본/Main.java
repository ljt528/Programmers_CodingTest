package org.example;

public class Main {

    public boolean main(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                    break;
                }
            }
        } else answer = false;
        return answer;
    }
}