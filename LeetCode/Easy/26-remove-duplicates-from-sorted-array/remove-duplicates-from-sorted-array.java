class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int count=1;
        int elem = nums[0];

        for(int n: nums){
            if(elem != n){
                count++;
                elem =n;
                nums[count-1]=n;
            }
        }

        return count;
    }
}
