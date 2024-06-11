/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberBasedProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    static int temp,r,num=0,c=0,n;
    static void checkArmNum(int no)
    {
        while(no>0)
        {
            r=no%10;
            num+=Math.pow(r,c);
            no=no/10;
        }
        if(num==temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
    public static void main(String agrs[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To check:- ");
        n= sc.nextInt();
        temp=n;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        checkArmNum(temp);
            
    }
    
}
