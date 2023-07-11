import java.io.*;

class Demo
{
    public int iValue;

    public Demo(int iNo)
    {
        iValue = iNo;
    }

    public void Display()
    {
       for(int iCnt = iValue;iCnt != 0;iCnt--)
       {
        System.out.print("*\t");
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

        dobj.Display();
    }
}