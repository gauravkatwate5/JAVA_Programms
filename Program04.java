import java.io.*;

class Demo
{
    public int iValue;

    public Demo(int iNo)
    {
        iValue = iNo;
    }

    public boolean Check()
    {
      if(iValue % 5 == 0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}

class Program04
{
    public static void main(String arg[]) 
    { 
        int iNo = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        try
        {
            System.out.println("Enter Any Number : ");
            iNo = Integer.parseInt(bobj.readLine());
        }
        catch(IOException obj)
        {

        }

        Demo dobj = new Demo(iNo);

        boolean bRet = dobj.Check();

        if(bRet == true)
        {
            System.out.println("Given Number Is Divisible by 5");
        }
        else
        {
            System.out.println("Given Number Is Not Divisible by 5");
        }
    }
}