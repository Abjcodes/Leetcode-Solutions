class Solution {
    public int maxSubArray(int[] nums) {
        int temp_sum = 0;
        int sum = nums[0];
        for(int i = 0; i<nums.length;i++)
        {
            temp_sum += nums[i];
            if(temp_sum>sum)
                sum = temp_sum;
            if(temp_sum<0)
                temp_sum = 0;
        }
        return sum;
    }
}
