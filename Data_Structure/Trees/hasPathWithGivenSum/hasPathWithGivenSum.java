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
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if (t==null)
        if (s!=0)
            return false;
        else
            return true;
    else{
        if (t.left==null && t.right!=null)
            return hasPathWithGivenSum(t.right,s-t.value);
        else if (t.left!=null && t.right==null)
            return hasPathWithGivenSum(t.left,s-t.value);
        else
            return hasPathWithGivenSum(t.left,s-t.value) || hasPathWithGivenSum(t.right,s-t.value);
    }
}
