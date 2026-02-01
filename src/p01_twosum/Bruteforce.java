package p01_twosum;

public class Bruteforce {
    public int[] twoSum(int[] nums, int target) {
        // just checking the brute force approach
        for (int i =0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};

                }
            }
        }
        return new int[]{-1,-1};

    }
}
