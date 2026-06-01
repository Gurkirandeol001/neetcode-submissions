class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size=nums.length;
        HashSet<Integer>set=new HashSet<>();
        {
            for(int i=0;i<nums.length;i++)
            {
                set.add(nums[i]);
            }
        }
        if(set.size()==size)
        {
            return false;
        }
        else

        {
            return true;
        }
    }
}