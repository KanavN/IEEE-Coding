class Solution {
    public int hammingWeight(int n) {
        if(n>0)
        {
            return((n%2)+hammingWeight(n/2));
        }
        else
            return 0;
    }
}