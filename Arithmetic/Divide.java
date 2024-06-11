/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arithmetic;

import java.util.Scanner;
public class Divide {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of A and B-");
        System.out.println("Note: B is not be Zero");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println(c);
    }
}
