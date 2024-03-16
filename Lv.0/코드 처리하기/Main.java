package org.example;

public class Main {
    public String main(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        int idx = 0;
        String[] str = code.split("");

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if ((str[i]).equals("1")) {
                    mode += 1;
                } else {
                    if (idx % 2 == 0) {
                        ret += str[i];
                    }
                }
            } else if (mode == 1) {
                if ((str[i]).equals("1")) {
                    mode -= 1;
                } else {
                    if (idx % 2 == 1) {
                        ret += str[i];
                    }
                }
            }
            idx += 1;
        }
        if (ret.isBlank()) {
            ret += "EMPTY";
        }
        answer = ret;
        return answer;
    }
}