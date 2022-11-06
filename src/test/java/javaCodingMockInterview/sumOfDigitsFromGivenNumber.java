package javaCodingMockInterview;

public class sumOfDigitsFromGivenNumber {
    public static void main(String[] args) {
        int number = 4577;
        int originalNum = number;
        int sum = 0;
        // 4577- 457 - 45 - 4 - 0
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;
        }
        System.out.println("The sum of " + originalNum + " is equals to " + sum);
    }
}