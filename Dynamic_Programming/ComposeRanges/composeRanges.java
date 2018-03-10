String[] composeRanges(int[] nums) {
    int consecutive = 1;
    String[] beginEnd = new String[nums.length];
    for (int i=0; i<nums.length; i++)
        beginEnd[i]="";

    if (nums.length==0)
        return beginEnd;
    else{
        int current=nums[0];
        beginEnd[0] = Integer.toString(nums[0]);
        int beginEndIndex=0;
        boolean flag=true;
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i]-current!=1)
            {
                consecutive++;
                beginEndIndex++;
                if(beginEndIndex==nums.length)
                {
                    beginEnd[beginEndIndex-1] = Integer.toString(nums[i]);
                    break;
                }
                if (!flag)
                {
                    beginEnd[beginEndIndex]=Integer.toString(current);
                    beginEndIndex++;
                }
                    current=nums[i];
                // consecutive++;
                if(beginEndIndex==nums.length)
                {
                    beginEnd[beginEndIndex-1] = Integer.toString(nums[i]);
                    break;
                }
                beginEnd[beginEndIndex]=Integer.toString(nums[i]);
                flag = true;
            }else{
                if (flag)
                    beginEnd[beginEndIndex]=beginEnd[beginEndIndex]+"->";
                flag=false;
                current=nums[i];
                if(i+1==nums.length)
                    beginEnd[beginEndIndex+1]= Integer.toString(current);
            }
        }
        for (int i=0;i<beginEnd.length; i++)
        {
            System.out.println(beginEnd[i]);
        }
        String[] toreturn = new String[consecutive];
        for (int i=0; i<consecutive; i++)
            toreturn[i]="";
        int j=0;
        for (int i=0; i<consecutive; i++)
        {
                if (beginEnd[j].contains("->"))
                {
                    toreturn[i]=beginEnd[j]+ beginEnd[j+1];
                    j+=2;
                }
                else{
                    toreturn[i]= beginEnd[j];
                    j++;
                }

        }
        return toreturn;
    }

}
