class Solution {
    public int reverse(int x) {
        int rev=0;
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=-x;
        }
        while(x>0){
            int a= x%10;
            if(rev>2147483647/10 ){return 0;}
            rev= (rev*10)+a;
             
           x= x/10;
        }
     
        if(isNegative){
            rev = -rev;
        }
        return rev;
    }
}