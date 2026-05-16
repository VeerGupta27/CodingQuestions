class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subStr = "";
        int len=0;
        for ( char ch: s.toCharArray()){
            if(subStr.contains(ch+"")){
                
                len= Math.max(len,subStr.length());
                subStr=subStr.substring(subStr.indexOf(ch+"")+1);
            }
           
                subStr+=ch+"";
            
        }
        len= Math.max(len,subStr.length());
        return len;
    }
}
