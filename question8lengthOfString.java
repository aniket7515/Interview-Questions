package Interview;

public class question8lengthOfString {
    public static void main(String[] args) {
        //Find length of String without using any inbuilt method in java?
        String str="Aniket Pravin Dhokane is a Developer";
        System.out.println(getLengthOfstring(str));
    }

    static int getLengthOfstring(String str){
        int length=0;
        char[] strCharArray = str.toCharArray();

        for(char c:strCharArray){
            length++;
        }return length;
    }
}
