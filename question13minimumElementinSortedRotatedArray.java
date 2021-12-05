package Interview;

public class question13minimumElementinSortedRotatedArray {
    public static void main(String[] args) {

        //Java program to find minimum element in a sorted and rotated array :
        int[] arr={16,19,21,25,3,5,8,10};
        System.out.println(findMinimumElementinRotatedSortedArray(arr));

    }
    static int findMinimumElementinRotatedSortedArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start + (end-start)/2;

            if(arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }return arr[start];
    }
}
