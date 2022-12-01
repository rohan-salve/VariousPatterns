package com.variousPatterns.patterns;
/*

 * * * * * * * * * * *
 * * * * *   * * * * *
 * * * *       * * * *
 * * *           * * *
 * *               * *
 *                   *
 *                   *
 *                   *
 *                   *
 *                   *
 * * * * * * * * * * *

 */

public class assign1Pattern3 {
    public assign1Pattern3() {
        int row, col;
        int n= 11;// Use N=Prime Numbers as it will give correct patterns

        for (row = 0 ; row < n ; row++)
        {
            for (col = 0 ; col < n ; col++)
            {
                if(row==0 || row==n-1||
                        row+col<=n/2 ||
                        col-row>=n/2 ||
                        col==0 ||col==n-1
                )
                    System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
