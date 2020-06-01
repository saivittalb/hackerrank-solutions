import java.io.*;
import java.math.*;
public class Solution
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        if(n%2!=0)
        System.out.println("Weird");
        if(n%2==0)
        {
            if(n>=6 && n<=20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }
}
