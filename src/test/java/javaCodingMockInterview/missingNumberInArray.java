package javaCodingMockInterview;

import java.util.Arrays;

public class missingNumberInArray {
        public static void main(String[] args) {
                // this example only for the numbers between 0 to 9 and only finds the one missing number
                int [] arr={0,4,6,1,9,7};
// find missing number from given array
// 0, 1,2,3,4... 9
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
//                int num=0;
                for(int i=0;i<arr.length-1;i++){
                        if(arr[i]!=arr[i+1]-1){
                                System.out.println(arr[i]+1);
                        }
//                        num++;
                }
        }
}
