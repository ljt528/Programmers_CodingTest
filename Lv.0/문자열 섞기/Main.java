public class Main {
    public String main(String str1, String str2) {
        String[] a_word = str1.split("");
        String[] b_word = str2.split("");
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += a_word[i];
            answer += b_word[i];
        }
        return answer;
    }
}