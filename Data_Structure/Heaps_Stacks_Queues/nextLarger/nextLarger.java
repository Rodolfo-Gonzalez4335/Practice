int[] nextLarger(int[] a) {
    //LIFO
    Stack<Integer> stack = new Stack();
    int j=1;
    for (int i=0; i<a.length; i++)
    {
        int value = a[i];
        j=i+1;
        while (j!=i)
        {
            if (j<a.length)
            {
                int jvalue = a[j];
                if (value>=jvalue)
                    j++;
                else{
                    stack.push(jvalue);
                    break;
                }
            }else{
                stack.push(-1);
                break;
            }

        }
    }

    int[] toreturn = new int[stack.size()];
    int size = stack.size();
    for (int i=size-1; i>=0; i--)
    {
        toreturn[i] = stack.pop();
    }

    return toreturn;

}
