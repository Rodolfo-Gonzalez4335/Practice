String[][] groupingDishes(String[][] dishes) {
    HashMap<String, String> map = new HashMap<String, String>(); 
    TreeMap<String, ArrayList<String>> dictMap = new TreeMap<String, ArrayList<String>>();
    List<Set<String>> list = new ArrayList<Set<String>>();
    ArrayList<String> temp;
    for (int i=0; i<dishes.length; i++)
    {

        for (int j=1; j<dishes[i].length; j++)
        {
            if (map.containsKey(dishes[i][j]))
            {
                if (!dictMap.containsKey(dishes[i][j]))
                {
                    temp = new ArrayList<String>();
                    temp.add(dishes[i][j]);
                    temp.add(map.get(dishes[i][j]));
                    temp.add(dishes[i][0]);
                    
                    dictMap.put(dishes[i][j], temp);
                }else{
                    dictMap.get(dishes[i][j]).add(dishes[i][0]);
                }
            }
            map.put(dishes[i][j],dishes[i][0]);
        }
    }
    String[][] toreturn = new String[dictMap.size()][];
    int counter=0;
    
    for (String key : dictMap.keySet())
    {
        temp =dictMap.get(key);
        String head = temp.get(0);
        Collections.sort(temp);
        temp.remove(head);
        temp.add(0,head);
        toreturn[counter] = temp.toArray(new String[dictMap.get(key).size()]);
        counter++;
    }
    
    return toreturn;
}
