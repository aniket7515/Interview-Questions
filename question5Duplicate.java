package Interview;

public class question5Duplicate {
    public static void main(String[] args) {
        //Java Program to find duplicate Characters in a String
        String s="AniketDhokane";

        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){

                    System.out.print(s.charAt(j)+" ");


                }
            }

        }




    }
}
