class Solution {
    public String longestCommonPrefix(String[] strs) {     
        String ans = strs[0];
        String temp = "";
        
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {
                
                if (ans.charAt(j) == strs[i].charAt(j)) {
                    temp += ans.charAt(j);
                }
                else{
                    break;
                }
            }
            ans = temp;
            temp = "";
        }
        return ans;
    }
}