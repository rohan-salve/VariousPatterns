package com.variousPatterns.patterns;

/*

 * * * * * * * * * * *
 * *               * *
 *   *           *   *
 *     *       *     *
 *       *   *       *
 *         *         *
 *       *   *       *
 *     *       *     *
 *   *           *   *
 * *               * *
 * * * * * * * * * * *



 */

public class recWithDiagonals {
    public static void main(String[] args) {
        int row , col;
        int n=11;

        for (row =0 ; row< n ; row++)
        {
            for (col = 0 ; col< n ; col++)
            {
                if(row==0 || row== n-1||
                        col == 0 || col == n-1 ||
                        row==col || row+col == (n-1))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
