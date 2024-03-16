package org.example;

public class Main {
    public int main(String s) {
        int answer = 0;
        if (s.substring(0,1) == "-") {
            answer = -Integer.parseInt(s.substring(1));
        } else if (s.substring(0,1) != "-") {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}