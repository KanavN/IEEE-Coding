class Solution {
    public int pivotIndex(int[] nums) {

        int arr[]=new int[nums.length];
        arr[0]=nums[0];

        for(int i=1;i<nums.length;i++)
            arr[i]=arr[i-1]+nums[i];
        
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            int left=0;int right=0;
            if(i==0)
            {
                left=0;
                right=arr[nums.length-1]-arr[0];
            }
            else if(i==nums.length-1) 
            {
                right=0;
                left=arr[nums.length-2];
            }  
            else
            {
                left=arr[i-1];
                right=arr[nums.length-1]-arr[i];
            }

            if(left==right)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}