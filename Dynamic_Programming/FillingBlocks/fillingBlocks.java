
int fillingBlocks(int n) {
    if (n <= 0)
      return 0;
    else if (n == 1)
      return 1;
    else if (n == 2)
      return 5;
    else if (n == 3)
      return 11;
    else if (n == 4)
      return 36;
    else{
      int[] memoization = new int[n+1];
      memoization[0]=0;
      memoization[1]=1;
      memoization[2]=5;
      memoization[3]=11;
      memoization[4]=36;

      for(int i=5; i<=n; i++)
        memoization[i] = memoization[i-1]+5*memoization[i-2]+memoization[i-3]-memoization[i-4];

      return memoization[n];
    }


}
