package javaCodingMockInterview;

public class alphaCharacters {
    public static void main(String[] args) {

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";

//        String replaced=given.replaceAll( "[^A-Za-z]" , "");
//        System.out.println(replaced.length());
//        System.out.println(replaced);
        String str="";
        for (int i = 0; i < given.length(); i++) {
            if(Character.isAlphabetic(given.charAt(i))){
                str+=given.charAt(i);
            }
        }
        System.out.println(str);
        }
    }

