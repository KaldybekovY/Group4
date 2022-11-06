package javaCodingMockInterview;

public class reverseStringWordByWord {
    public static void main(String[] args) {
        String str="I love group 4";
        String reversed="";
        String[] array=str.split(" ");
//        for (int i = array.length-1; i >=0; i--) {
//            reversed+=array[i]+" ";
//        }
//        System.out.println(reversed);

        for (int i = 0; i < array.length; i++) {
            String word="";
            for (int j = array[i].length()-1; j >=0 ; j--) {
                word+=array[i].charAt(j);
            }
            reversed+=word+" ";
        }
        System.out.println(reversed);
    }


}
