class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //double for loop to itterate  through and  sum values til target is reached
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++)  {
                if (nums[i]+nums[j]==target) {
                //if target is summed  to then return current indeces in new int array     
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}