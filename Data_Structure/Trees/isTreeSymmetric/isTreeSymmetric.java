//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean isTreeSymmetric(Tree<Integer> t) {
    LinkedList<Tree<Integer>> list = new LinkedList<Tree<Integer>>();

    if (t==null)
        return true;

    Tree<Integer> left=t.left,right=t.right;

    list.add(t.left);
    list.add(t.right);

    while (list.size()>0)
    {
        left = list.poll();
        right = list.poll();

        if (left==null ^ right==null)
            return false;
        else if (left==null && right==null){
            //leaf node
        }
        else if ((double)left.value!=(double)right.value)
                return false;
        else
        {
            list.add(left.left);
            list.add(right.right);
            list.add(left.right);
            list.add(right.left);
        }

    }

    return true;
}
