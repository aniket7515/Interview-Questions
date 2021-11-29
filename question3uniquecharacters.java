package Interview;

public class question3uniquecharacters {
    public static void main(String[] args) {
        // Write a program to check if String has all unique characters in java?

        String s="abcdeffghijklm";
        System.out.println(UniqueCharacters(s));

    }
    static boolean UniqueCharacters(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }return true;
    }
}
