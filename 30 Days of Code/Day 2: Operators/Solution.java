import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        double mealCost = Double.parseDouble(br.readLine());
        int tipPercent = Integer.parseInt(br.readLine());
        int taxPercent = Integer.parseInt(br.readLine());
        double totalCost, tip, tax;
        tip = (mealCost * tipPercent)/100;
        tax = (mealCost * taxPercent)/100;
        totalCost = mealCost + tip + tax;
        int totalCost1 = (int)Math.round(totalCost);
        System.out.println("The total meal cost is " + totalCost1 + " dollars.");
    }
}
