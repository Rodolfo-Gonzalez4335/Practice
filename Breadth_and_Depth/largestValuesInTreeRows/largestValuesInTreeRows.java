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
int[] largestValuesInTreeRows(Tree<Integer> t) {
    LinkedList<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
    LinkedList<Integer> depthArray = new LinkedList<Integer>();
    ArrayList<Integer> toreturn = new ArrayList<Integer>();
    
    int depth=0;
    if (t==null)
        return new int[0];
    queue.add(t);
    toreturn.add(t.value);
    depthArray.add(depth);
    
    while (queue.size()>0)
    {
        Tree<Integer> temp = queue.pop();
        depth = depthArray.pop(); 
        if (toreturn.size()<depth+1)
            toreturn.add(temp.value);
        else
        {
            if (toreturn.get(depth)<temp.value)
            {
                toreturn.set(depth,temp.value);
            }
        }
           
        if (temp.right!=null)
        {
            queue.add(temp.right);
            depthArray.add(depth+1);
        }
        if (temp.left!=null)
        {
            queue.add(temp.left);
            depthArray.add(depth+1);
        }
        
    }
    
    int[] realToReturn = new int[toreturn.size()];
    
    for (int i=0; i<toreturn.size(); i++)
    {
        realToReturn[i]=toreturn.get(i);
    }
    
    return realToReturn;
}
