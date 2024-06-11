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
public class LeastCommonMultiple {
    public static void main(String args[]) {
        int no1, no2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:- ");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        for (int i = 1; i <= no1*no2; i++) {
            if (i % no1  == 0 && i % no2 == 0) {
                System.out.println("Least Common  Number of:- " + no1 + " and " + no2+" is "+i);
                break;
            }
        }
        
            
        
    }
    
}
