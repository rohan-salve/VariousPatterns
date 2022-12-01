package com.variousPatterns.patterns;

//INEURON in Star
// Trick - Use recWithDiagonal code as a base for alphabets
public class assign1Pattern1 {

    public assign1Pattern1() {
        int row, col;
        int n = 7;

        for(row = 0; row < n ; row++)
        {

            //I
            for (col = 0 ; col< n ; col++)
            {
                if(row==0 || row== n-1|| col == n/2)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //N
            for (col = 0 ; col < n ; col ++)
            {
                if(col == 0 || col == n-1 || row==col )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //E
            for (col = 0 ; col < n ; col ++)
            {
                if(row==0 || row== n-1||
                        col == 0 || row == n/2)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //U
            for (col = 0 ; col< n ; col++)
            {
                if(  row== n-1||
                        col == 0 || col == n-1
                       )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //R
            for (col = 0 ; col< n ; col++)
            {
                if(row==0 || row== n/2 ||
                        col == 0 || col == n-1 && row < n/2 ||
                        row==col && row > n/2 )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //O
            for (col = 0 ; col< n ; col++)
            {
                if(row==0 || row== n-1||
                        col == 0 || col == n-1
                        )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");

            //N
            for (col = 0 ; col < n ; col ++)
            {
                if(col == 0 || col == n-1 || row==col )
                    System.out.print("* ");
                else System.out.print("  ");
            }


            System.out.println();
        }
    }
}
