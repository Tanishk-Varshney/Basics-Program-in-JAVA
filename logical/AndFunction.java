/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.util.Scanner;
public class AndFunction {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of A, B and C-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("The Greater value is = " +a);
        }
        if((b>a)&&(b>c))
        {
            System.out.println("The Greater value is = " +b);
        }
        if((c>a)&&(b<c))
        {
            System.out.println("The Greater value is = " +c);
        }
    }
}
