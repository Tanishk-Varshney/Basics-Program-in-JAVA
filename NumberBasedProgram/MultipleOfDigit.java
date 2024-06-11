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
public class MultipleOfDigit {
    static int Tsum(int n){
        int r,no=n,total=1;
        while(no>0){
            r = no % 10;
            total*=r;
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
        System.out.println("Multiple of Digit is - " + Tsum(a));
    }
    
    
}
