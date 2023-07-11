class Solution {
//to solve convert int to string, reverse string, if string is == to reverse return true
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        String reverse= new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)) {
            return true;
        }
        else return false;
    }
}