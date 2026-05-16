class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        int[] inter = new int[n];
       
        List<Integer> ans = new ArrayList<>();            
        for(int m: nums){
           inter[m-1]=m;
        }
                
        for (int i=0; i<n; i++){
            if(inter[i]==0){
                ans.add(i+1);
            }
        }    
            
            
        
        return ans;
    }
}