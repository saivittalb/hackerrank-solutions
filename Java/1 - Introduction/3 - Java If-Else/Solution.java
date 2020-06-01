import java.io.*;
import java.math.*;
class WeirdNumber
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        if(n>100)
            System.exit(0);
        else
        {
            if(n%2!=0)
                System.out.println("Weird");
            else
            {
                if(n>=6 && n<=20)
                    System.out.println("Weird");
                else
                    System.out.println("Not Weird");
            }
        }
    }
}
