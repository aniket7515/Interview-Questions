package Interview;

public class question3uniquecharacters {
    public static void main(String[] args) {
        // Write a program to check if String has all unique characters in java?

        String s="abcdeffghijklm";
        System.out.println(UniqueCharacters(s));
        System.out.println(UniqueCharactersMethod2(s));

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
    static boolean UniqueCharactersMethod2(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                }
                if(count>1){
                    return false;
                }
            }
        }return true;
    }
}
