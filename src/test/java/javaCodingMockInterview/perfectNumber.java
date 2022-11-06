package javaCodingMockInterview;

import java.util.Arrays;

public class perfectNumber {

//    static boolean isPerfect(int n) {
//// To store sum of divisors
//        int sum = 1;
//// Find all divisors and add them
//        for (int i = 2; i * i <= n; i++) // 4<6
//        {
//            if (n % i==0)//6%2==0
//            {
//                if(i * i != n)//4!=6 //2*2!=28
//                    sum += i + n / i;//1+2+3
//                else
//                    sum = sum + i;
//            }
//        }
//// If sum of divisors is equal to
//// n, then n is a perfect number
//        if (sum == n && n != 1) {
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args){
        boolean isAPerfectNumber=false;
        int num1=6;
        int bucket=1;
        for(int i=2;i<=num1/2;i++){
        if(num1%i==0){
        bucket+=i;
            }
        }
        if(bucket==num1){
            isAPerfectNumber=true;
        }
        System.out.println(isAPerfectNumber);
        }
}


//    public static void main(String[] args) {
//        // 6=>1,2,3
//        //6=6
//
//        //1,2,4,7,14=28
//        System.out.println(isPerfect(6));
//    }

