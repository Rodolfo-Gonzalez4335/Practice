// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
//Better space complexity than version 1 
ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
    int count=1;
    boolean firstRun=true;
    
    ListNode<Integer> start=l;
    ListNode<Integer> before=l;
    ListNode<Integer> head = l;
    if (k==1)
        return l;
    while (l!=null)
    {
        if (count==k)
        {
            count=1;
            reverse(start,l, k);
            if (firstRun)
            {
                head=l;
                before=start;
                firstRun=false;
            }
            else{
                before.next=l;
                before=start;
            }
            l=start=start.next;
        }else{
            count++;
            l=l.next;
        }
    }
    return head;
}
void reverse(ListNode<Integer> start, ListNode<Integer> end, int count)
{
    ListNode<Integer> temp = start.next;
    start.next=end.next;
    count--;
    while(count>0)
    {
        end=temp.next;
        temp.next=start;
        start=temp;
        temp=end;
        count--;
        
    }
}