//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
//the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
//it will automatically contact the police if two adjacent houses were broken into on the same night.

//Given a list of non-negative integers representing the amount of money of each house, 
//determine the maximum amount of money you can rob tonight without alerting the police.
public class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        int[] temp = new int[size+1];
        for(int i=0;i<size;i++){
            temp[i] = nums[i];
        }
        
        temp[size] = 0;
        
        int sum = 0;
        int max = temp[0];
        int maxIndex = 0;
        int n=0;
        while(n<(size/2+1)){
            for(int i=1;i<size;i++){
                if(temp[i]>max && ((temp[i-1] != -1 && temp[i+1] != -1)||(i==size-1&&temp[i-1] != -1))){
                    max = temp[i];
                    maxIndex = i;
                }
                
                sum += max;
                temp[maxIndex] = -1;
                nums[maxIndex] = -1;
            }
        }
        
        return sum;

    }
}
