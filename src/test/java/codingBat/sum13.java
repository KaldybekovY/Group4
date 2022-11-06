package codingBat;

public class sum13 {



    public static void main(String[] args) {
            int[] nums={1, 2, 13, 1};
            int sum = 0;
            int i = 0;
            while(i < nums.length) {
                if(nums[i] == 13) {
                    i += 2;
                } else {
                    sum += nums[i];
                    i++;
                }
            }
            System.out.println(sum);
        }
    }
