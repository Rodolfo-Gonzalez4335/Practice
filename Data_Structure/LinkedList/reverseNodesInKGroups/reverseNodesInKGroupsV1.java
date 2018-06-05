//wrong space complexity
// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
    LinkedList<Integer> queue= new LinkedList<Integer>();
    ListNode<Integer> toreturn = new ListNode<Integer>(-99);
    ListNode<Integer> head=toreturn;
    int count=0;

    while( true)
    {
        queue.add(l.value);
        count++;
        if (count==k)
        {
             while(!queue.isEmpty())
            {
                ListNode<Integer> temp = new ListNode<Integer>(queue.pollLast());
                toreturn.next=temp;
                toreturn=toreturn.next;
            }
            count=0;
        }
        if(l.next==null)
        {
             while(!queue.isEmpty())
            {
                ListNode<Integer> temp = new ListNode<Integer>(queue.pop());
                toreturn.next=temp;
                toreturn=toreturn.next;
            }
            break;
        }
        else
            l=l.next;
    }

    return head.next;
}
