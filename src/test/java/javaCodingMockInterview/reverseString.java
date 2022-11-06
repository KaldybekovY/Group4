package javaCodingMockInterview;

public class reverseString {
    public static void main(String[] args) {
        //reverse String with help of StringBuffer
        String word = "Hello Techtorial";

        StringBuffer sb = new StringBuffer(word);
        System.out.println(sb.reverse());

        //2 way using to charAt();
        String toReverse = "Hello Techtorial";

        String reversed = "";
        for (int i = toReverse.length() - 1; i >= 0; i--) {

            System.out.println("Reversed String is: " + reversed);
        }
    }
}
