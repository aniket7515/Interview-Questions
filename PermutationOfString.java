package Interview;

import java.util.Arrays;

public class PermutationOfString {
    public static void main(String[] args) {
        // to check permutation of string convert it into array sort it and compare
        String a="abcdett";
        String b="acedbfg";
        System.out.println(PermutationOfString(a,b));


    }
    static boolean PermutationOfString(String a,String b){
        int n1=a.length();
        int n2=b.length();

        if(n1!=n2){
            return false;
        }

        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<n1;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }return true;


    }
}
