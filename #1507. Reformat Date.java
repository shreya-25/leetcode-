class Solution {
    public String reformatDate(String date) {
        String date1="",month="",year="",out="";
        String arr[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i=0;i<date.length();i++)
        {
            if(date.charAt(i)>='a'&& date.charAt(i)<='z')
            {
                date1=date.substring(0,i);
                month=date.substring(i+3,i+6);
                year=date.substring(i+7);
                break;
            }
        }
        out=year+"-";
        for(int i=0;i<arr.length;i++)
        {
            if(month.equals(arr[i]))
            {
                if((i+1)<10)
                    out+="0"+(i+1)+"-";
                else
                    out+=(i+1)+"-";
            }
        }
        if(date1.length()==1)
            out+="0"+date1;
        else
             out+=date1;
        
        return out;
    }
}
