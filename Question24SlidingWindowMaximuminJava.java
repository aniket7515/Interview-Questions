package Interview;
import java.util.Scanner;

public class Question24SlidingWindowMaximuminJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr={23,345,45,54,343,356,46,757,34};
        int window=in.nextInt();

        solve(arr,window);

    }
    public static void solve(int[] arr, int k){
        for(int i=k;i<arr.length;i++){
            int max=Integer.MIN_VALUE;

            for(int j=i-k;j<i;j++){
                max=Math.max(max,arr[j]);
            }
            System.out.println(max);

        }
    }
}
