package javaCodingMockInterview;

public class findSecondLargest {

    public static void main(String[] args) {
        int[] array = {100, 300, 350, 450, 450};
        int largest = array[0];
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
            secondLargest = largest;
            largest = array[i];
        } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
