package com.variousPatterns.patterns;
/*

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

*/

public class assign1Pattern2 {
    public assign1Pattern2() {
        int row, col;
        int n = 5;

        for (row = 1; row< n ; row++)
        {
            for (col = 1 ; col < n ; col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
