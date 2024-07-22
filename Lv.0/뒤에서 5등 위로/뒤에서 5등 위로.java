import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int listLength = Math.min(num_list.length - 5, num_list.length);     
        return Arrays.copyOfRange(num_list, num_list.length - listLength, num_list.length);
    }
}