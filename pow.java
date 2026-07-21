class Solution {
    public double myPow(double x, int n) {
        long p = n ;
        if(p<0)
        {
            x = 1/x;
            p = -p;
        }
        return power(x , p);

    }
    public double power(double x , long p )
    {
        if(p==0)
        {
            return 1 ;
        }
        double half = power(x , p/2);
        if(p%2==0)
        {
            return half*half;
        }
        else
        {
            return x*half*half;
        }
    }
}