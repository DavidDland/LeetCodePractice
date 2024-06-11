class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels ="aeiouAEIOU";
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if(!vowels.contains(arr[i]+ "")) {
                i++;
                continue;
            }
            if(!vowels.contains(arr[j]+ "")) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}