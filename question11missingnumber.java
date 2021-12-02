package Interview;

public class question11missingnumber {
    public static void main(String[] args) {

        //Question 11 : Find missing number in the array.

        int[] nums ={1,2,4,5,6,7};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums){
        int n=nums.length+1;

        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        int sum2=n*(n+1)/2;
        int result = sum2-sum1;
        return result;
    }
}
