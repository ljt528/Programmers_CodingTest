public class Main {
    public int main(int a, int b) {
        int answer = 0;
        String a_num = Integer.toString(a);
        String b_num = Integer.toString(b);

        String a_plus_b = a_num + b_num;

        int a_b_num = Integer.parseInt(a_plus_b);

        if (2*a*b > a_b_num) {
            answer = 2*a*b;
        } else {
            answer = a_b_num;
        }

        return answer;
    }
}