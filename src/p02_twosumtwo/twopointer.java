package p02_twosumtwo;

public class twopointer {

    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length -1 ;
        int left=0;
        while (left < right ){
            int sum = numbers[left]+ numbers[right];
            if (sum== target){
                return new int [] {left+1 , right +1};
            }
            else if (sum<target){
                left++;
            }
            else if (sum>target){
                right--;
            }
        }
        return new int [0];

    }
}
