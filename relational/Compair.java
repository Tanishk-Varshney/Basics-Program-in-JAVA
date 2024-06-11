/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relational;

import java.util.Scanner;
public class Compair {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of A and B-");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Both are Equal");
        }
        else
            System.out.println("Both are Different values");
    }
    
}
