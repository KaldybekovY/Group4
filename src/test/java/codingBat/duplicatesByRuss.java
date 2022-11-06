package codingBat;

import java.util.Arrays;

public class duplicatesByRuss {
    public int[] duplicate(int[]one, int[]two){
        int distance =0;
        if (one.length>two.length)
        {distance =one.length;} else{distance=two.length;}
        int[] three = new int[distance];

        int k =0;
        int finalLength=0;
        for (int i=0 ; i< one.length;i++){
            for (int j=0 ; j< two.length; j++){
                if (one[i]==two[j]) {
                    three[k]=one[i];
                    k++;
                    finalLength++;
                    break;
                }
            }
        }

        int[]four=new int[finalLength];
        for (int i=0; i<finalLength;i++){
            four[i]=three[i];
        }
        Arrays.sort(four);
        System.out.println(Arrays.toString(four));

        if (finalLength==0){
            return null;
        } else {
            return four;
        }
    }

}
