package codingBat;

public class isEverywhere {
    public static void main(String[] args) {

            int[] nums={1, 2, 1, 3};
            int val=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=val&&nums[i+1]!=val){
                    System.out.println(false);
                }
            }
        System.out.println(true);
        }
    }

