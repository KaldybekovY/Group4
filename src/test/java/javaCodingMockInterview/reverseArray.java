package javaCodingMockInterview;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int nums [] ={45,62,7,67,23,35,11};
        for(int i=0;i<nums.length/2;i++){//i=3
            int temp=nums[i]; //7
            nums[i] = nums[nums.length-1-i]; // 35
            nums[nums.length-1-i]=temp; //
        }
        System.out.println(Arrays.toString(nums));
    }
}
