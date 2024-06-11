/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramsofmca;

import java.util.Scanner;

public class SkipNumber {

    boolean check(int p, int n) {
        String str = "";
        str = p + "";
        
        for (int i = 0; str.length() >= i; i++) {
            
            char digit = str.charAt(i);
//            System.out.print("d-"+digit+"\tn- "+n);
            if (digit != n) {
//                System.out.print("b-"+n);
//                System.out.print("c-"+digit);
                return true;
            } else {
               
                return false;
            }
        }
        return false;

    }

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
            boolean no = ob.check(i, n);
            if (no) {
                System.out.print("\t" + i);
                if (i % 10 == 0) {
                    System.out.println();
                } else {
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    continue;
                }
                if (i == 100) {
                    System.out.println("      --------------------------------------------------------------------------------");
                }
            }

        }

    }
}
