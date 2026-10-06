class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int temp=i,count=0;
            while(temp!=0)
            {
                int mask=1;
                if((temp&mask)==1)
                    count++;
                temp>>=1;
            }
            ans[i]=count;
        }
        return ans;
    }
}