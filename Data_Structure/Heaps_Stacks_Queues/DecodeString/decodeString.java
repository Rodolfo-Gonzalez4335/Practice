String decodeString(String s) {
    String number="",result="";
    for (int i=0; i<s.length(); i++)
    {
        int openBracket = findOpened(s);
        if (s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            number+=Character.toString(s.charAt(i));
        }else if (s.charAt(i)=='['){
            int matchedOpened = findMaching(s,i);
            String temp="";
            temp = decodeString(s.substring(i+1,matchedOpened));
            for (int j=0; j<Integer.parseInt(number); j++)
                result+=temp;
            number="";
            i= matchedOpened;
        }else {
            result+=s.charAt(i);
        }
    }
    return result;
}

int findMaching(String s, int start)
{
    int totalMatching=1;
    for (int i=start+1; i<s.length(); i++)
    {
        if (s.charAt(i)=='[')
        {
            totalMatching++;
        }
        else if (s.charAt(i)==']')
            totalMatching--;
        System.out.println(i);
        if (totalMatching==0)
            return i;
    }
    System.out.println("Should Not Reach This point: Returned -99");
    return -99;
}

int findOpened(String s)
{
    for (int i=0; i<s.length(); i++)
    {
        if (s.charAt(i)=='[')
            return i;
    }
    System.out.println("Should Not Reach This point: Returned -99::");
    return -99;
}
