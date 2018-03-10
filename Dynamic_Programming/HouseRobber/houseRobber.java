int houseRobber(int[] nums) {
    int[] sum = new int[nums.length];

    if (nums.length==0)
        return 0;
    else{
        if (nums.length<3)
        {
            if (nums.length==1)
            {
                return nums[0];
            }else{
                if(nums[0]>nums[1])
                    return nums[0];
                else
                    return nums[1];
            }
        }
        else
        {
            sum[0]=nums[0];
            sum[1]=nums[1];
            sum[2]=nums[0]+nums[2];
            for (int i=3; i<nums.length; i++)
            {
                if (sum[i-2]> sum[i-3])
                {
                    sum[i]= sum[i-2]+nums[i];
                }else{
                    sum[i]= sum[i-3]+nums[i];
                }
            }
            if (sum[nums.length-1]>sum[nums.length-2])
                return sum[nums.length-1];
            else
                return sum[nums.length-2];
        }
    }
}
