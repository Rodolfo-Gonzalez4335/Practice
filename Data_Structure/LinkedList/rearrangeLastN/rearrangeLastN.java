// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
    ListNode<Integer> head = l;
    ListNode<Integer> begin =l;
    ListNode<Integer> before_begin = l;
    ListNode<Integer> end=l;
    
    int count = 0,size=0;
    boolean stop_once=false;
    if (l==null || n==0)
        return l;
    
    while (l!=null)
    {
        
            if (count==n)
            {
                if (stop_once)
                    before_begin=before_begin.next;
                begin=begin.next;
                stop_once=true;
            }
            else{
                count++;
            }
        
        if (l.next==null)
        {
            end=l;
        }
        l=l.next;
        size++;
    }
    if (size==n)
        return head;
    before_begin.next=null;
    end.next=head;
    return begin;
}
