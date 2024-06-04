class Solution {
/**
* Just doing binary addition. 
*/
public String addBinary(String a, String b) {
    int carry = 0;
    String result = "";
    int l1 = a.length()-1;
    int l2 = b.length()-1;
    while (l1 >= 0 || l2 >= 0 || carry == 1) {
        if (l1 >= 0) {
            carry += Integer.parseInt(a.charAt(l1)+"");
            l1--;
        }
        if (l2 >= 0) {
            carry += Integer.parseInt(b.charAt(l2)+"");
            l2--;
        }
        result = String.valueOf(carry%2) + result;
        carry /= 2;
    }
    return result;
}
}
    