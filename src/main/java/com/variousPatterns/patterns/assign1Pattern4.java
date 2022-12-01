package com.variousPatterns.patterns;
/*






 *                   *
 * *               * *
 * * *           * * *
 * * * *       * * * *
 * * * * *   * * * * *
 * * * * * * * * * * *



 */
public class assign1Pattern4 {
    public assign1Pattern4() {
        int row,col;
        int n= 11;

        for (row=0; row< n ; row++)
        {
            for (col=0; col<n ; col++)
            {
                if (row==n-1 || row-col>=n/2 || row+col >= (n-1)+(n/2)  )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
