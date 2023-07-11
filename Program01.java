import java.io.*;

class Devide
{
    public int iValue1;
    public int iValue2;

    public Devide(int iNo1,int iNo2)
    {
        iValue1 = iNo1;
        iValue2 = iNo2;
    }

    public int devide()
    {
        if(iValue1 < iValue2)
        {
            return 0;
        }

        int ans = 0;

        ans = iValue1 / iValue2;

        return ans;
    }
}

class Program01
{
    public static void main(String arg[]) 
    {
        int iNo1 = 0;
        int iNo2 = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        try
        {
        System.out.println("Enter First Number : ");
        iNo1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Second Element : ");
        iNo2 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException obj)
        {

        }
      
        Devide dobj = new Devide(iNo1,iNo2);

        int iRet = dobj.devide();

        System.out.println("Division is : " + iRet);   
    }
}