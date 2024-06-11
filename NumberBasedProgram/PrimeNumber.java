/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberBasedProgram;

/**
 *
 * @author tnny2
 */
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String args[])
    {
        int no,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:- ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
                if(no%i==0)
                    count++;
        }
        if(count==2)
            System.out.println("Prime Number :- "+no);
        else
            System.out.println("Not P.N. :- "+no);
        
        
    }
}