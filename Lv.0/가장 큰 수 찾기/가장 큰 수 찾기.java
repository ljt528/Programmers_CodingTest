class Solution {
    public int[] solution(int[] array) {
        int maxNum = Integer.MIN_VALUE; // 최대값을 저장할 변수를 정수 최솟값으로 초기화
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                index = i;
            }
        }
        int[] answer = {maxNum, index};
        return answer;
    }
}