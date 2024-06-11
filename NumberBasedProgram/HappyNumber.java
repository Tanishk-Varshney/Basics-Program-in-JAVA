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
public class HappyNumber {
    public static void main(String args[]) {
       int a, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number here - ");
        a = sc.nextInt();
        rem = a % 10;
        if (rem == 1) {
            System.out.println("Happy Number - " + a);
        } else {
            System.out.println("Unhappy Number - " + a);;
        }
    }
}
