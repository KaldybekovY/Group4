package javaCodingMockInterview;

public class sumOfGivenNumber {
    public static void main(String[] args) {
        int number = 4577;
//        int originalNum = number;
        int sum = 0;
        // 4577- 457 - 45 - 4 - 0
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
//            OUTPUT: The sum of 4577 is equals to 23
        }
        System.out.println("The sum of " + number + " is equals to " + sum);
    }
}
