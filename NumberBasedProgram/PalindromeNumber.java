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
public class PalindromeNumber {
    static int rev(int n){
        int r,no=n,total=0;
        while(no>0){
            r = no % 10;
            total=total*10+r;
            no=no/10;
        }
        return total;
    }
    public static void main(String agrs[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number here - ");
        a = sc.nextInt();
        int n=rev(a);
        if(n==a)
            System.out.println("Entered Number is Palindrome Number");
        else
            System.out.println("Entered Number is Not Palindrome Number");
    }
    
    
}
