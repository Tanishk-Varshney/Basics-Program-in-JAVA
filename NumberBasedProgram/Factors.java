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
public class Factors {
    public static void main(String args[])
    {
        int no,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:- ");
        no=sc.nextInt();
        System.out.print("\nFactors of "+no+" :- ");
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
            System.out.print(i+", ");
            }
        }
        
    }
    
}
