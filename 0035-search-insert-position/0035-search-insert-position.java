class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid=(left+right)/2;
        while(left<right)
        {
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;
            mid=(left+right)/2;
        }
        if(target<nums[0])
            return 0;
        else if(target>nums[nums.length-1])
            return nums.length;
        else if(target>nums[left])
            return left+1;
        else
            return left;
    }
}