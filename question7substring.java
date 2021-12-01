package Interview;

public class question7substring {
    public static void main(String[] args) {
        // Find all substrings of a String in java

        String str="abc";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
