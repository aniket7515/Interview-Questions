package Interview;

public class question1reverseString {
    public static void main(String[] args) {
        //Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?
        String a="ILoveJava";
        String rev="";

        for(int i=a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        System.out.println("The reversed string is :"+rev);


    }

}
