class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

//Attempting 1st Binary search, basically find the midpoint then check if target is under or over compared to mid and adjust left and right. 
//Eventually left should always be on target as right gets removed or left gets pushed forward towards target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } 
                else if (nums[mid] < target) {
                left = mid + 1;
                } 
                else {
                right = mid - 1;
                }
        }
        return left;
    }
}