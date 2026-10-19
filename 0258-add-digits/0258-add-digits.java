class Solution {
    public int addDigits(int num) {
        int copy=0;
        while(num>0)
        {
            copy=(copy*10)+(num%10);
            num/=10;
            if(num==0 && copy<10)
                break;
            else if(num==0 && copy>9)
            {
                num=copy;
                copy=0;
            }
        }
        return copy;
    }
}