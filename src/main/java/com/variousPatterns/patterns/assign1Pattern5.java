package com.variousPatterns.patterns;
/*

 * * * * * * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * * * * * * *



 */
public class assign1Pattern5 {
    public assign1Pattern5() {
        int row, col;
        int n=11;

        for (row=0 ; row<n ; row++)
        {
            for (col=0 ; col<n ; col++)
            {
                if (row==0||col==0||row==n-1||
                        row+col<=n/2 ||
                        row-col>=n/2)
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
