class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans^=nums[i];
        }
        int arr[]=new int[2];
        int j=0;
        while((ans&1)!=1)
        {
            ans>>=1;
            j++;
        }
        int mask=1<<j;
        ans=0;
        j=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&mask)==0)
                ans=ans^nums[i];
            else
                j=j^nums[i];
        }
        arr[0]=ans;
        arr[1]=j;
        return arr;
    }
}