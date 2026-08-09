class Solution 
{
    public int singleNumber(int[] nums) 
    {
        for (int a = 0 ;a<nums.length;a++)
        {
            if(check(nums, nums[a])==1)
            {
                return nums[a];
            }
        }
        return -1;
    }

        public static int check(int[] nums, int target)
        {
            int count = 0;
            for(int k = 0;k<nums.length;k++)
                {
                    if(nums[k]==target)
                    {
                        count++;;
                    }
                }
                return count; 
        }
        

}