/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberBasedProgram;

import java.util.Scanner;

/**
 *
 * @author tnny2
 */
public class FibonacciSeries {
    public static void main(String args[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:- ");
        no=sc.nextInt();
        int a=0,b=1,c;
        System.out.print("\nFibonacci Series of "+no+" :- "+a+" "+b+" ");
        for(int i=2;i<no;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
        System.out.println("\n");
        
    }
    
}
