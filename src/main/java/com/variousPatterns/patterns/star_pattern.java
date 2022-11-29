package com.variousPatterns.patterns;

/*

 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *



*/

public class star_pattern {
    public static void main(String[] args) {
        int row,col;
        int n=11;
        for (row =0 ; row < n ; row++ )
        {
            for(col=0 ; col < n ; col++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
