//basically check if needle in haystick. Return index of needle in haystack. Return -1 if needle is not in haystack
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}