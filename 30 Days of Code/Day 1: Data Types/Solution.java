import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

int i1 = scan.nextInt();
int i2 = i1 + i;
double d1 = scan.nextDouble();
double d2 = d1 + d;
String s1 = scan.nextLine();
s1+= scan.nextLine();
System.out.println(i2);
System.out.println(d2);
System.out.println(s+s1);
        scan.close();
    }
}
