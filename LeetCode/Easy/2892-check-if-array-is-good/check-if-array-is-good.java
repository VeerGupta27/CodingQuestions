class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int max= nums[n-1];
        if(n==max+1){
            for(int i=0; i<max; i++){
                if(nums[i]==i+1){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        else
        {
            return false;
        }

        return true;
    }
}