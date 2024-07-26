class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replaceStr = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        if(replaceStr.contains(pat)) {
        	answer = 1;
        }
        return answer;
    }
}