package codingBat;

public class sum67 {
    public static void main(String[] args) {

        int[] nums={1, 2, 2, 6, 99, 99, 7};
        int sum = 0;

        boolean inRange = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                inRange = true;

            if(!inRange)
                sum += nums[i];

            if(inRange && nums[i] == 7)
                inRange = false;
        }
        System.out.println(sum);
    }
}