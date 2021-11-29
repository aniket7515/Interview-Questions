package Interview;

import java.util.Arrays;

public class question2Anagrams {
    public static void main(String[] args) {
           //Write a java program to check if two Strings are anagram in java?
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));


    }
    static boolean isAnagram(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }
        char arrt[]=t.toCharArray();
        char arrs[]=s.toCharArray();

        Arrays.sort(arrt);
        Arrays.sort(arrs);

        for(int i=0; i<arrs.length;i++){
            if(arrs[i]!=arrt[i]){
                return false;
            }
        }return true;
    }
}
