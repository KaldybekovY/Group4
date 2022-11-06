package javaCodingMockInterview;

public class splitMethod {
    public static void main(String[] args) {
        String techtorial="Techtorial interview preparation document. ";
        String [] words=techtorial.split(" "); // will split the string with the spaces.
        System.out.println(words.length);
        for (String string : words) {
            System.out.println(string);
        }
    }
}
