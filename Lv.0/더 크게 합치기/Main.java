public class Main {
    public int main(int a, int b) {
        int answer = 0;
        String a_num = Integer.toString(a);
        String b_num = Integer.toString(b);

        String a_plus_b = a_num + b_num;
        String b_plus_a = b_num + a_num;

        int a_b_num = Integer.parseInt(a_plus_b);
        int b_a_num = Integer.parseInt(b_plus_a);
        
        if (b_a_num > a_b_num) {
            answer = b_a_num;
        } else {
            answer = a_b_num;
        }

        return answer;
    }
}