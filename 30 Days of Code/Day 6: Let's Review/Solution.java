import java.io.*;
import java.util.*;
import java.math.*;
public class Solution
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int T = Integer.parseInt(br.readLine());
        String[] S = new String[T];
        for(int i = 0; i < T; i++)
        {
            S[i] = br.readLine();
        }
        for(int i = 0; i < T; i++)
        {
            String S1 = S[i];
            int l = S1.length();
            for(int j = 0; j <= l-1; j++)
            {
                char c = S1.charAt(j);
                if(j%2==0 || j==0)
                    System.out.print(c);
            }
            System.out.print(" ");
            for(int j = 0; j <= l-1; j++)
            {
                char c = S1.charAt(j);
                if(j%2!=0)
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}
