import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int value : delete_list) {
            deleteSet.add(value);
        }
        
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            if (!deleteSet.contains(value)) {
                answer.add(value);
            }
        }
        
        return answer;
    }
}
