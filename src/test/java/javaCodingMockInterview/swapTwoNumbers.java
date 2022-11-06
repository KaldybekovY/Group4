package javaCodingMockInterview;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a
        // temporary variable?
        int a=5;
        int b=10;
        a=a+b;// first this should be there a=5+10=15
        b=a-b; // b= 15-10=5
        a=a-b; //a=15-5=10
        System.out.println(a);
        System.out.println(b);
    }
}
