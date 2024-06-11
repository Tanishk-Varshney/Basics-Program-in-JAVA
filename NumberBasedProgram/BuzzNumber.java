/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberBasedProgram;


/**
 *
 * @author tnny2
 */

import java.util.Scanner;

public class BuzzNumber {

    public static void main(String args[]) {
        int a, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number here - ");
        a = sc.nextInt();
        rem = a % 10;
        if (rem == 7 || a % 7 == 0) {
            System.out.println("Buzz Number - " + a);
        } else {
            System.out.println("Not Buzz Number - " + a);;
        }
    }
}
