class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                currentCount++;
            }
            else if (nums[i + 1] != nums[i]) {
                currentCount = 1;
            }
            if (currentCount > maxCount) maxCount = currentCount;
        }
        return maxCount;
    }
}
