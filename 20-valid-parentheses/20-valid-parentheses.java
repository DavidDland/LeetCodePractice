import java.util.Stack;
//importing a stack to approach this so that I can pop values and check popped values against 
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
//creating a char array to store and index more efficiently
        for (int i = 0; i < chars.length; i++) {
            char currChar = chars[i];
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);   //popping opening brackets 
            } else {
//test case if no opening brackets means no values get popped
                if (stack.isEmpty()) {
                    return false;
                }
                char popped = stack.pop();
                if (popped == '(') {
                    if (currChar != ')') {
                        return false;
                    }
                } else if (popped == '{') {
                    if (currChar != '}') {
                        return false;
                    }
                } else if (popped == '[') {
                    if (currChar != ']') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }
}