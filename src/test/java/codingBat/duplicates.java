package codingBat;

import java.util.Arrays;

public class duplicates {

        //Create a public method named codingBat.duplicates that takes
        //two int arrays as parameters and returns common elements of both arrays as an int array.
        //IF there is no common element of arrays, return null.
        //NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
        //For example:
        // array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]
        // return int array is [2,3,9] -> !!array is sorted
        // example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]
        // return int array is [1]
        // example 3 : array 1 -> [0,1,1,1,0]  array 2 -> [2,9,90]
        // return null   -> because there is no common element for arrays.
        // NOTE: This question might be harder than it seems, and it can take time .
        // Please make sure you covered all the  posibilities and your return type name etc. are all correct.
        // If you cover all possibilities with your method, tests shall pass.
        // GOOD LUCK !


    public static int[] duplicates(int[] nums, int[] nums2) {
        // We have to find all common elements and store them in a String. If i store them as a String with the spaces between the numbers, then i will be able to split them and make it int[] array again.
        // int[] nums = [2,1,1,9,0];
        // int[] nums2 = [2,1,0];
        // int[] result = [2,1,0];

        String commons=""; //bucket for the String
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums[i]==nums2[j]){ // this finds common elements
                    commons+=nums[i]+" "; // doesn't matter here if i store nums[i] or nums2[j], because both stores common elements
                    // " " we added space to be able to split numbers with split method
                }
            }
        }

        //" 2 1 1 0 "

        if(commons.length()==0){
            return null; // IF there is no common element of arrays, return null.
        }

        String[] commonArray=commons.trim().split(" "); // trim() because we don't want to have any space at the end since we added spaces after each element
        //This commonArray has the numbers in String format: ["2","1","1","0"]
        //The commons String can have codingBat.duplicates, therefore we need to remove all the codingBat.duplicates from commons array
        String commonsWithoutDup=" "; //added space because
        // Every number in commonsWithoutDup will have a space between at front of it and after it.
        for(int i=0; i<commonArray.length; i++){
            if(!commonsWithoutDup.contains(commonArray[i])){
                commonsWithoutDup+=commonArray[i]+" ";

                //commonsWithoutDup = " 2 1 0 "
            }
        }
        // I have common elements in the commonsWithoutDup
        String[] commonsWithoutDupArray=commonsWithoutDup.trim().split(" ");
        // commonsWithoutDupArray=["2","1","0"]
        int[] commonNumbers=new int[commonsWithoutDupArray.length];
        for(int i=0; i<commonNumbers.length; i++){
            //Convert String into an int = Parse()
            // int num = Integer.parseInt("2");
            // sout(2);
            commonNumbers[i]=Integer.parseInt(commonsWithoutDupArray[i]);
            //commonNumbers[i]=[2,"1","0"]
            //commonNumbers[i]=[2,1,"0"]
            //commonNumbers[i]=[2,1,0]
        }
        Arrays.sort(commonNumbers);
        //commonNumbers=[0, 1, 2]
        return commonNumbers;
    }


    public static void main(String[] args) {
        duplicates duplicates=new duplicates();
        int [] nums = {2,1,1,0,0};
        int [] nums2 ={2,1,0};
        System.out.println(Arrays.toString(duplicates(nums,nums2)));
    }
}
