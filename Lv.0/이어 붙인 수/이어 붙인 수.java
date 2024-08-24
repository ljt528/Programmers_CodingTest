class Solution {
    public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenSum = evenSum * 10 + num;
            } else {
                oddSum = oddSum * 10 + num;
            }
        }
        return evenSum + oddSum;
    }
}