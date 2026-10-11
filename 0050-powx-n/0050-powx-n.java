class Solution {
    public double myPow(double x, int n) 
    {
        if(n==0 || x==1)
            return 1;
        if(n>0)
            return calculate(x,n);
        else
            return 1/calculate(x,-n);

    }
    public double calculate(double x, int n)
    {
        if(n==0)
            return 1;
        else
        {
            double half=calculate(x,n/2);
            if(n%2==0)
                return half*half;
            else
                return half*half*x;
        }
    }
}