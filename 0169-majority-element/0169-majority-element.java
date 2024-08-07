class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int ret = 0;
        
        for (int num: nums) {
            if(!myMap.containsKey(num))
                myMap.put(num, 1);
            else
                myMap.put(num, myMap.get(num)+1);
            if (myMap.get(num) > nums.length/2) {
                ret = num;
                break;
            }
        }
        return ret;
    }
}