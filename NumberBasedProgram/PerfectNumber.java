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
public class PerfectNumber {
    
    public static void main(String agrs[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number here - ");
        a = sc.nextInt();
        int n=a,sum=0;
        
        for(int i=1;i<a;i++)
            if(n%i==0)
            {
                sum+=i;
            }
        if(sum==a)
            System.out.println("Entered Number is Perfect Number");
        else
            System.out.println("Entered Number is Not Perfect Number");
    }
    
}
