import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            int current = nums[i];
            int next = nums[i+1];
            for(int j = current+1;j<next;j++){
                l1.add(j);
            }
        }
        return l1;
    }
}