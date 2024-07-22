class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char num : my_string.toCharArray()) {
            if (Character.isDigit(num)) {
                answer += Character.getNumericValue(num);
            }
        }
        return answer;
    }
}