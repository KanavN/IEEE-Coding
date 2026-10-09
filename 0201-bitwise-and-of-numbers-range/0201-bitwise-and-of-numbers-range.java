class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int i=0;
       while(right>0)
       {
            if(left==right)
                break;
            left>>=1;right>>=1;
            i++;
       }
       return right<<i;
    }   
}