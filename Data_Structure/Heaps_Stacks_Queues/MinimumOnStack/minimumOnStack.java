int[] minimumOnStack(String[] operations) {
    Stack<Integer> list = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    ArrayList<Integer> toreturn = new ArrayList<Integer>();

    String[] substring;
    int min=Integer.MAX_VALUE;

    for (int i=0; i<operations.length; i++)
    {
        substring = operations[i].split(" ");
        int temp;
        if (substring[0].equals("push"))
        {
            Integer toadd= Integer.parseInt(substring[1]);
            list.push(toadd);

            if (min>=toadd)
            {
                minStack.push(min);
                min = toadd;
                // System.out.println(min);
            }

        }
        else if (substring[0].equals("pop"))
        {
            temp = list.pop();
            if (min==temp && !list.empty()&& !minStack.empty())
            {
                min = minStack.pop();
            }
            else if (list.empty())
                min=Integer.MAX_VALUE;

        }
        else if (substring[0].equals("min"))
             {
                toreturn.add(min);
            }

    }

    return returnfunction(toreturn);
}
int[] returnfunction(ArrayList<Integer> toreturn)
{
    int[] toreturnn = new int[toreturn.size()];

    for (int i=0; i<toreturn.size(); i++)
    {
        toreturnn[i]=toreturn.get(i);
    }
    return toreturnn;
}
