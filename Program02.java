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
       for(int iCnt = 1;iCnt <= iValue;iCnt++)
       {
        System.out.println("Hello world");
       }
    }
}

class Program02
{
    public static void main(String arg[]) 
    { 
        Demo dobj = new Demo(5);

        dobj.Display();
    }
}