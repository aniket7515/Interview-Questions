package Interview;

public class question12searchinRotatedSortedArray {
    public static void main(String[] args) {

        //Question 12 : Search an element in rotated and sorted array.

        int[] nums={16,19,21,25,3,5,8,10};
        int target=5;
        System.out.println(SearchInRotatedSortedArray(nums,target));

    }
    static int SearchInRotatedSortedArray(int[] nums , int target){
        int start =0;
        int end=nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }if(nums[mid]<=nums[end]){
                if(target>nums[mid] && target <= nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(nums[start]<=target && target< nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return -1;
    }
}
