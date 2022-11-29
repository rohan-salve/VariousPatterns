package com.variousPatterns.patterns;
/*

****
***
**
*

*/

public class t2 {
    public static void main(String[] args) {
        int row,col;
        int n=11;
        for(row=0;row<n;row++)
        {
            for(col=n-1; col>row; col--)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
