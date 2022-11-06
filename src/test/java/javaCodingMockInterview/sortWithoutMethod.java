package javaCodingMockInterview;

import java.util.Arrays;

public class sortWithoutMethod {
    public static void main(String[] args) {
        int [] nums={3,7,6,2,9};
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]>nums[k]){// 1)3>2       2)7>6    3)6>3
                    temp=nums[i];//    1)temp=3    2)7      3)6
                    nums[i]=nums[k];// 1)nums[i]=2 2)6      3)3
                    nums[k]=temp;//    1)nums[k]=3 2)7      3)6
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
