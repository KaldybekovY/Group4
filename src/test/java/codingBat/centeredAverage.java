package codingBat;

public class centeredAverage {
    public static void main(String[] args) {

            int[] nums={1, 2, 3, 4, 100};
            int min=nums[0];
            int max=nums[0];
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                min=Math.min(min, nums[i]);
                max=Math.max(max, nums[i]);
            }
        System.out.println((sum-min-max)/(nums.length-2));
        }
    }

