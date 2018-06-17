int mapDecoding(String message) {
    if (message.isEmpty())
        return 1;
    if (message.charAt(0)=='0')
        return 0;
    int[] array = new int[message.length()];
    int[] combinations = new int[message.length()+1];

    for (int i=0; i<message.length(); i++)
    {
        char n = message.charAt(i);
        array[i]= n-'1'+1;
    }
    
    combinations[0]=1;
    int mod =1000000007;
    if (message.length()==1)
        return 1;
    if (array[1]==0)
        combinations[1]=0;
    else
        combinations[1]=1;
    for (int i=2; i<message.length()+1;i++)
    {
        int value = array[i-1];
        int value1 = array[i-1]+ array[i-2]*10;
        
        if (value>0)
        {
            combinations[i]+=combinations[i-1]%mod;
        }

        if (value1>9&&value1<27)
        {
            combinations[i]+= combinations[i-2]%mod;
        }
    }
    
    return combinations[message.length()];
    
}

