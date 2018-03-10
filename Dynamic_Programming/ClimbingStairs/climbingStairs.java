int climbingStairs(int n) {
    int [] toreturn = new int[n];
    if (n>2)
    {
        toreturn[0]=1;
        toreturn[1]=2;
        for (int i=2; i<n; i++)
        {
            toreturn[i] = toreturn[i-1]+ toreturn[i-2];
        }
    }else{
        return n;
    }
    return toreturn[n-1];
}
