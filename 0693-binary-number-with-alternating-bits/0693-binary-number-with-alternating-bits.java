class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev3=n%2;
        n/=2;
        int prev2=n%2;
        n/=2;
        if(prev3==prev2)
                return false;
        while(n>0)
        {
            prev3=prev2;
            prev2=n%2;
            n/=2;
            if(prev3==prev2)
                return false;
        }
        return true;
    }
}