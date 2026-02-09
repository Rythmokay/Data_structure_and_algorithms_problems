package p10_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class TwoPointer {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long cursum = 0, maxSum = 0;
        int left = 0;
        for (int right =0;right < nums.length ;right++){
            while (set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);
                cursum=cursum -nums[left];
                left++;
            }
            cursum+=nums[right];
            set.add(nums[right]);
            if (set.size()==k){
                maxSum=Math.max(cursum,maxSum);
            }
        }
        return maxSum;

    }
}
