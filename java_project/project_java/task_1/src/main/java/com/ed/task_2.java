package com.ed;


/**
 * Hello world!
 *
 */
public class task_2 
{
    public static void main( String[] args )
    {
        int i;
        for (int n = 1; n<101; n++){
            i = 0;

            for (int j = 1; j <= n; j++){
                if (n % j == 0)
                j++;
            }
            if (i <= 2 & i > 1) 
                System.out.println(n);
        }


    }
}
