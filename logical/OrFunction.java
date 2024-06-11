/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.util.Scanner;
public class OrFunction {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of A and B-");
        a=sc.nextInt();
        b=sc.nextInt();
        if((a>=20)||(b<=20))
        {
            System.out.println("Or Logical Operater is True");
        }
        else
            System.out.println("Or Logical Operater is False");
        
    }
    
}
