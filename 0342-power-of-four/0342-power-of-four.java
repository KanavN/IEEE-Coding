class Solution {
    public boolean isPowerOfFour(int n) {
        double p = Math.sqrt(n);
        int pp=(int)Math.sqrt(n);
        double ppp=pp;
        if(p!=ppp)
            return false;
        return n > 0 && (n & (n - 1)) == 0;
    }
}