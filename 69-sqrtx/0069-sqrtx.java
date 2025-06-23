class Solution {
/**
* Classic Binary Search
*/
    public int mySqrt(int x) {
        // Since x is a valid solution
        if(x==0) 
            return 0;
        // vars
        int low = 1;
        int high = x;
        int ans = 0;
        
        // set our loop
        while (low <= high) {
            // Find our mid point
            int mid = low + (high-low)/2;
            // If mid is sqrt return mid
            if( x/mid == mid )
                return mid;
            // else if it is lower reduce upper bound
            else if(x/mid < mid)   
                high = mid - 1;
            else {
            // else its lower and return the midpoint -1
                low = mid + 1; 
                ans = mid;
            }
        }
        return ans;
    }
}