package com.variousPatterns.patterns;

/*

****
 ***
  **
   *

*/

public class t3 {
    public static void main(String[] args) {
        int row, col;
        int n=11;

        for (row =0 ; row < n ; row++)
        {
            for(col=0 ; col < n; col++)
            {
                if (col>=row)
                {
                    System.out.print("* ");
                }
                //else System.out.print("");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
