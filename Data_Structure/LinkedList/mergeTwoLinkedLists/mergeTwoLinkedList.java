// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    ListNode<Integer> toreturn = new ListNode<Integer>(-99);
    ListNode<Integer> head=toreturn;
    while (l1!=null || l2!=null)
    {
        ListNode<Integer> temp = new ListNode<Integer>(-99);

        if (l1==null)
        {
            temp.value=l2.value;
            l2=l2.next;
        }else if (l2==null)
        {
            temp.value=l1.value;
            l1=l1.next;
        }else
        {
            if (l1.value>l2.value)
            {
                temp.value=l2.value;
                l2=l2.next;
            }else{
                temp.value=l1.value;
                l1=l1.next;
            }
        }
        toreturn.next=temp;
        toreturn=toreturn.next;
        
    }
    return head.next;
}