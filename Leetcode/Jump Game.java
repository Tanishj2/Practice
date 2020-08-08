class Solution {
    public boolean canJump(int[] nums) {
        
        int dest = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(dest < i)
                return false;
            dest = Math.max(dest,i+nums[i]);
        }   
        return true;
    }
}
