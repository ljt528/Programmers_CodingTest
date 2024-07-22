class Solution {
    public int[] solution(int n, int[] numlist) {
        int j = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                j++;
            }
        }
        int[] answer = new int [j];
        int k = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[k] = numlist[i];
                k++;
            }
        }
        return answer;
    }
}