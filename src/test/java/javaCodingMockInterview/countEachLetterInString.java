package javaCodingMockInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class countEachLetterInString {
    public static Map<Character,Integer> countLetter(String str){
        Map<Character, Integer> result=new LinkedHashMap<>();//
// techtorial
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.containsKey(ch)){
                int count=result.get(ch); //1
                result.replace(ch,++count);//dynamic
            } else{
                result.put(ch,1);//static
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countLetter("techtorial is the best"));
    }
}
