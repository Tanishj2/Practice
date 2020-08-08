class Solution {
    public int jump(int[] nums) {
        int pos = 0;        
        int dest = 0;    
        int jump = 0;    
        
        
      //  if(nums.length == 1)return 0;           //check edges cases  
        for(int i=0;i<nums.length-1;i++)
        {
            //find max dest 
            dest = Math.max(dest,i+nums[i]);            //max(0,2)
    
            //check jumps are completed or over.
            if(pos == i)                        //ye condition ab 2 tak ni chlega   i.e. 0 ==0
            {
                jump++; 
                pos = dest;
            }
        }
        return jump;
        
    }
}
