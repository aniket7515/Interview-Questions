package Interview;

public class question19sumEqualtoPairOfElements {
    public static void main(String[] args) {
        // Find all pairs of elements from an array whose sum is equal to given number
        int[] arr={ -40, -5, 1, 3, 6, 7, 8, 20 };
        int X=15;
        findPairWithSumEqualTo(arr,X);


    }
    public static void findPairWithSumEqualTo(int[] arr , int X){
        if(arr.length<2){
            return;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tempSum= arr[i]+arr[j];

                if(tempSum==X){
                    System.out.println(arr[i] + " "+arr[j]);
                }
            }
        }
    }
}
