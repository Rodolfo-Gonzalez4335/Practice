boolean areFollowingPatterns(String[] strings, String[] patterns) {
    TreeMap<String,String> map = new TreeMap<String,String>();
    TreeMap<String,String> map2 = new TreeMap<String,String>();
    
    for (int i=0; i<strings.length; i++)
    {
        map.put(patterns[i], strings[i]);
        map2.put(strings[i], patterns[i]);
    }
    
    int count =0;
    for (int i=0; i<strings.length; i++)
    {
        if (!map.get(patterns[i]).equals(strings[count]))
            return false;
        if (!map2.get(strings[i]).equals(patterns[count]))
            return false;
        count++;
    }
    return true;
}
