class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            arr[i]=arr[i-1]+nums[i];
        double max=arr[k-1];
        for(int i=k;i<nums.length;i++)
        {
            if(arr[i]-arr[i-k]>max)
                max=arr[i]-arr[i-k];
        }
        return max/k;
    }
}