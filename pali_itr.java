import java.lang.String;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int length=str.length();
        int ans=0,f=0;
        for(int i=length;i>=1;i--)
        {   f=0;
            int start=0,j=0,temp1=0,temp2=0,max=0,min=0;
            while(j<str.length())
            {
                f=0;
                int temp=start+i-1;
                int t=temp;
                for(j=start;j<=(start+t)/2;j++)
                {
                    temp1=str.charAt(j);
                    temp2=str.charAt(temp);
                    max=temp1>temp2?temp1:temp2;
                    min=temp1>temp2?temp2:temp1;
                    if (str.charAt(j)!=str.charAt(temp)&&(max-min)!=32)
                    {
                        f=1;
                        break;
                    }
                    temp--; 
                }   
                if (f==0)
                {
                    for(j=start;j<(start+i);j++)
                        System.out.print(str.charAt(j));
                    break;
                }
                j=start+i;
                start++; 
            }
            if (f==0)
               break;  
        } 
    }
}