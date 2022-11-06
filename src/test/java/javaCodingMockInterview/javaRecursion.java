package javaCodingMockInterview;

public class javaRecursion {


        public static String reverseString(String str){
            if (str.isEmpty())
                return str;
            //Calling Function Recursively
            return reverseString(str.substring(1)) + str.charAt(0); //j a v a=>a v a j
        }

    public static void main(String[] args) {
        System.out.println(reverseString("java"));
    }
    }

