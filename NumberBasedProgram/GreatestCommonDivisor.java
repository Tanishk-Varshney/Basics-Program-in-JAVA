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
public class GreatestCommonDivisor {
    public static void main(String args[]) {
        int no, no1, no2, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:- ");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        if (no1 > no2) {
            no = no1;
        } else {
            no = no2;
        }
        for (int i = 1; i <= no; i++) {
            if (no1 % i == 0 && no2 % i == 0) {
                count=i;
            }
        }
        
            System.out.println("Greatest Common Divisor Number of:- " + no1 + " and " + no2+" is "+count);
        
    }
    
}
