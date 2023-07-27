class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
//index start at 0 compare with j if diff then inc i 
        for(int j=1; j< nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}