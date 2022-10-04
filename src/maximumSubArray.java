import java.util.*;
public class maximumSubArray {

    static int maxsubArray(int[] nums){
        int currMax=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            if(currMax>max){
                max=currMax;
            }
        }
        return max;
    }
    public static void main(String[] args){

        int arrs[]={-2,1,-3,4,-1,2,1,-5,4};
        int a=maxsubArray(arrs);
        System.out.println(a);
    }
}
