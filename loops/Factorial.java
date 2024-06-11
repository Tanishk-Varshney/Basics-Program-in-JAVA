/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

import java.util.Scanner;


public class Factorial {
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
        int n,fact = 1;
        System.out.println("Enten the value which you want the Factorial:- ");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
            if(i==1)
               System.out.print(i); 
            else
            System.out.print(i +" x ");
        }
        System.out.println(" => "+fact);
 }
}
