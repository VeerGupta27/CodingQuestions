class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] res = new int[len];
        int j=0;

        for (int i=0; i<len; i++){
            
            if (i%2==0){
                res[i]=nums[i-j];
                j++;
            }
            else{
                res[i]=nums[i+n-j];
            }
        }

        return res;
    }
}
