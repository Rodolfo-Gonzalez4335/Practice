ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
    int sizeA=0,sizeB=0;

    ListNode<Integer> temp=a;
    while(temp!=null)
    {
        sizeA++;
        temp=temp.next;
    }
    temp=b;
    while(temp!=null)
    {
        sizeB++;
        temp=temp.next;
    }
    System.out.println(sizeA+ "   "+ sizeB);
    ArrayList<Integer> toreturn= new ArrayList<Integer>();
    int remainder=0;

    while(sizeA>0 || sizeB>0)
    {
        int result= getValue(a,sizeA)+getValue(b,sizeB)+remainder;
        if(result/10000>0)
        {
            remainder=1;
            result= result%10000;
        }else{
            remainder=0;
        }

        toreturn.add(result);
        sizeA--;
        sizeB--;
    }
    if (remainder==1)
        toreturn.add(remainder);
    ListNode<Integer> toReturn =new ListNode<Integer>(0);
    ListNode<Integer> headerReturn=toReturn;
    for(int i=toreturn.size()-1; i>=0; i--)
    {
        toReturn.value = toreturn.get(i);

        if (i!=0)
        {
            toReturn.next=new ListNode<Integer>(0);
            toReturn=toReturn.next;
        }
    }

    return headerReturn;
}
Integer getValue(ListNode<Integer> nodes,int size)
{
    if (size<1)
        return 0;
    ListNode<Integer>temp=nodes;
    while(size>1)
    {
        size--;
        temp=temp.next;
    }

    return temp.value;
}
