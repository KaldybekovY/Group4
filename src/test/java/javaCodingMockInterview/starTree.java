package javaCodingMockInterview;

public class starTree {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row-i; k++) {//5-1=4 5-2=3
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {//1<=1 1<=2
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
