package Interview;

import java.util.Arrays;

public class question10SmallestandLargest {
    public static void main(String[] args) {
        //Write java Program to Find Smallest and Largest Element in an Array.
        int[] arr={1,2,3,45,6,67,8,869,7,54};
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest is :"+smallest);
        System.out.println("Largest is :"+largest);


    }

}
