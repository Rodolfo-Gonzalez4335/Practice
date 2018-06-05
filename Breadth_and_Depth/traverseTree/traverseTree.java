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
int[] traverseTree(Tree<Integer> t) {
    LinkedList<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
    ArrayList<Integer> toreturn = new ArrayList<Integer>();
    
    //Breafirst
    if (t==null)
        return new int[0];
    
    queue.add(t);
    while (queue.size()>0)
    {
        Tree<Integer> temp = queue.pop();
        toreturn.add(temp.value);
        if (temp.left!=null)
            queue.add(temp.left);
        if (temp.right!=null)
            queue.add(temp.right);
    }
    int[] array = new int[toreturn.size()];
    for (int i=0; i<toreturn.size(); i++)
    {
        array[i]=toreturn.get(i);
    }
    return array;
}
