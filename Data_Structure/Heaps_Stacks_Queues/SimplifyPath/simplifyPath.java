String simplifyPath(String path) {
    String[] stack = path.split("/");
    ArrayList<String> stackkk = new ArrayList<String>();
    for (int j=0;j< stack.length; j++){
        System.out.println(stack[j]);
        if (stack[j].equals(".")||stack[j].equals("/"))
        {
            stack[j]="";
        }
        else if (stack[j].equals("..")){
            if (stackkk.size()-1>-1)
                stackkk.remove(stackkk.size()-1);
        }else
        {
            if (!stack[j].equals(""))
                if (stack[j].equals("/"))
                    stackkk.add(stack[j]);
                else
                    stackkk.add("/"+stack[j]);
        }
    }

    String toreturn ="";

    for(String i: stackkk){
        toreturn += i;
    }
    if (toreturn.equals(""))
        toreturn+="/";
    return toreturn;
}
