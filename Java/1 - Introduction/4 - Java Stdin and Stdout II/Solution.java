import java.io.*;
class Solution
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int i = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
