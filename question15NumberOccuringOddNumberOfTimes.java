package Interview;

public class question15NumberOccuringOddNumberOfTimes {
    public static void main(String[] args) {
        //Find the number occurring odd number of times in an array
        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println(getOddOccurence(arr));


    }
    static int getOddOccurence(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }if(count%2!=0){
                return arr[i];
            }
        }return -1;
    }
}
