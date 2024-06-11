/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramsofmca;

import java.util.Scanner;

/**
 *
 * @author tnny2
 */
public class Snumber2 {
     public static void main(String args[]) {
        SkipNumber ob = new SkipNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value:- ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                System.out.println("      _______________________________________________________________________________");
            }
            if (i % n == 0) {
                System.out.print("\t *");
                if (i % 10 == 0) {
                    System.out.println();
                }
                continue;
            } else {
                System.out.print("\t" + i);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
            if (i == 100) {
                System.out.println("      --------------------------------------------------------------------------------");
            }
        }
    
     }
}
