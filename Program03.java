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
        System.out.print(iCnt + "\t");
       }
    }
}

class Program03
{
    public static void main(String arg[]) 
    { 
        Demo dobj = new Demo(5);

        dobj.Display();
    }
}