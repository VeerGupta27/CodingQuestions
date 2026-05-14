class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        
        for(char ch: s.toCharArray()){
            
            if(ch== '(' || ch == '[' || ch == '{'){
                 stk.add(ch);
            }


            if(ch == ')' || ch == ']' || ch == '}'){

                 if(stk.isEmpty()) {
                    return false;
                }
                char tem = stk.pop();

                if(
                    (ch == ')' && tem !='(') ||
                    (ch == '}' && tem !='{') ||
                    (ch == ']' && tem !='[') )
                {
                    return false;
                }


            }
           
        }
            return stk.isEmpty();
        
    }
}