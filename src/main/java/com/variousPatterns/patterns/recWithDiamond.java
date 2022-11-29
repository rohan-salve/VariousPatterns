package com.variousPatterns.patterns;

/*

 * * * * * * * * * * *
 *       *   *       *
 *     *       *     *
 *   *           *   *
 * *               * *
 *                   *
 * *               * *
 *   *           *   *
 *     *       *     *
 *       *   *       *
 * * * * * * * * * * *



 */
public class recWithDiamond {
    public static void main(String[] args) {
        int row, col ;
        int n =11;


        for(row= 0 ; row< n ; row++)
        {
            for(col= 0; col<n ; col++)
            {
               if (row==0 || row == n-1 ||
                   col == 0 || col == n-1 ||
                    row+col == n/2 ||
                    col-row== n/2 ||
                    row-col== n/2 ||
                    row+col== n+(n-2)/2)
                   System.out.print("* ");
               else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
