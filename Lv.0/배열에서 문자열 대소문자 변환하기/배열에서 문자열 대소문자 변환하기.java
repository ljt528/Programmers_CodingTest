class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].toUpperCase();
            if(i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}