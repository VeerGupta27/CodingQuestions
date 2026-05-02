class Solution {
    public int rotatedDigits(int n) {

        int count =0;
        int prob = 0;

    for (int i = 1; i<=n; i++ ){
        int num = i;
        boolean isChanged = false;
         while (num>0){
        int digit = num%10;
        if(digit==3 || digit==4 || digit==7){
          prob =0;  
        }
        if (digit == 2 || digit ==5 || digit == 6|| digit ==9){
            isChanged = true;
        }
        
        num/= 10;
        }

        if (prob==1 && isChanged){
            count+=1;
        } 
        prob =1;
    }

    return count;
      
    }
}