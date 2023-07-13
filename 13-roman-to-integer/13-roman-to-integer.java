class Solution {
    public int romanToInt(String s) {
        int sum = 0;
//Basically switch case that involves all conditionals to check curr index-1 at values to see if they need to be added differently
        for (int i = 0; i < s.length(); i++) {   
            switch (s.charAt(i)) {
//in cases where it counts the previous like i and then the curr like ix it would count 1 + 8 since x is being read as 8; which in terms gives me the correct value
                case 'M': {
                    if (i > 0 && s.charAt(i-1) == 'C') 
                        sum += 800;
                    else sum += 1000;
                    break;
                }
                case 'D': {
                    if (i > 0 && s.charAt(i-1) == 'C') 
                        sum += 300;
                    else sum += 500;
                    break;
                }
                case 'C': {
                    if (i > 0 && s.charAt(i-1) == 'X') 
                        sum += 80;
                    else sum += 100;
                    break;
                }
                case 'L': {
                    if (i > 0 && s.charAt(i-1) == 'X') 
                        sum += 30;
                    else sum += 50;
                    break;
                }
                case 'X': {
                    if (i > 0 && s.charAt(i-1) == 'I') 
                        sum += 8;
                    else sum += 10;
                    break;
                }
                case 'V': {
                    if (i > 0 && s.charAt(i-1) == 'I') 
                        sum += 3;
                    else sum += 5;
                    break;
                }
                case 'I': {
                    sum += 1;
                    break;
                }
                default: return 0;
            }
        }
    return sum;
    }
}