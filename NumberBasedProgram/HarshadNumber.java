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
public class HarshadNumber {
    static int Tsum(int n){
        int r,no=n,total=0;
        while(no>0){
            r = no % 10;
            total+=r;
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
        int sum = Tsum(a);
        
        if (a%sum==0) {
            System.out.println("Harshad Number - " + a);
        } else {
            System.out.println("Not Harshad Number - " + a);;
        }
    }
    
}
