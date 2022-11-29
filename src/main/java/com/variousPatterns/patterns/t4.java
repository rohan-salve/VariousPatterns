package com.variousPatterns.patterns;
/*

 *
 **
 ***
 *****

 its mirror image can be created if we remove last print statement

 */

public class t4 {
    public static void main(String[] args) {
        int row, col;
        int n=11;

        for(row=0 ; row < n ; row ++)
        {
            for (col=0 ; col < n ; col++)
            {
                if ((row + col) >= (n - 1)) System.out.print("* ");
                else System.out.print("  ");  // System.out.print(""); //it will print t1 if spaces removed
            }
            System.out.println();
        }
    }
}
