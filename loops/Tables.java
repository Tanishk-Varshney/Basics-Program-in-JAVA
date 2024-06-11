/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

import java.util.Scanner;

public class Tables {
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enten the value which you want the Table:- ");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = " +n*i);
        }
    }
}
