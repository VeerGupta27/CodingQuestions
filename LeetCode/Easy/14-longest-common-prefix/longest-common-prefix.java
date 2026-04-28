class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        
        String prefix = strs[0];
        int end =strs.length-1;
        for (int i =0; i<end ; i++){

            String S1= prefix;
            String temp="";
            
                
            
            String S2 = strs[i+1];
            int len;

            if (S1.length()<S2.length()){
                len = S1.length();
            }

            else{
                len= S2.length();
            }


            for (int j=0; j <len; j++){

                if(S1.charAt(j)==S2.charAt(j)){
                    temp += S1.charAt(j);
                }
                else{
                    break;
                }

            }
            prefix=temp;
            if (prefix.equals("")) return "";

    

        }
        

        return prefix;
    }
}