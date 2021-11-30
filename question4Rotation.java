package Interview;

public class question4Rotation {
    public static void main(String[] args) {
        // How to check if one String is rotation of another String in java
        //Approach:
        //Lets say you need to check whether str1 and str2 is rotation of one another or not.
        //Create a new String with str3= str1 + str1
        //Check if str3 contains str2 or not.
        //if str3 contains str2 then str2 is rotation of str1 else it is not

        String str1="AniketDhokane1";
        String str2="Dhokane1Aniket";

        System.out.println(isRotation(str1,str2));



    }
    static boolean isRotation(String str1 , String str2){
        String str3=str1+str1;
        if(str3.contains(str2)){
            return true;
        }return false;
    }

}
