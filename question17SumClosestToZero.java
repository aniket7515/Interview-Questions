package Interview;

public class question17SumClosestToZero {
    public static void main(String[] args) {
        // Find a Pair Whose Sum is Closest to zero in Array
        int[] arr={1,3,-5,7,8,20,-40,6};
        FindPairWithMinSum(arr);


    }
    static void FindPairWithMinSum(int[] arr){
        if(arr.length<2){
            return;
        }
        int minSum= arr[0] + arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tempSum=arr[i]+arr[j];
                if( Math.abs(tempSum) < Math.abs(minSum) ){
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minSum=tempSum;
                }
            }
        }
        System.out.println("The pair of sum closest to zero is :"+arr[pair1stIndex]+"And"+arr[pair2ndIndex]);
    }
}
