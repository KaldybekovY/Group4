package codingBat;

public class bigDiff {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        System.out.println(max - min);
    }
}






