using System;

class Solution
{
    static void Main(String[] args)
    {

        var rangeP = long.Parse(Console.ReadLine());
        var rangeQ = long.Parse(Console.ReadLine());
        var printInvalidRange = true;
        for (var n = rangeP; n <= rangeQ; n++)
        {
            var kaprekarNumberFound = false;
            var square = n * n;
            var digitCount = n.ToString().Length;
            var strVal = square.ToString();

            var rPiece = long.Parse(strVal.Substring(strVal.Length - digitCount));
            long lPiece = 0;
            if (strVal.Length - digitCount > 0)
                lPiece = long.Parse(strVal.Substring(0, strVal.Length - digitCount));

            if (rPiece + lPiece == n)
            {
                Console.Write(n);
                kaprekarNumberFound = true;
                printInvalidRange = false;
            }

            if (kaprekarNumberFound)
                Console.Write(' ');
        }

        if (printInvalidRange)
            Console.WriteLine("INVALID RANGE");
    }
}
