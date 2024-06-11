/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramsofmca;

import java.util.Scanner;

public class NPrimeNumber {

    public static void main(String args[]) {
        int no, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:- ");
        no = sc.nextInt();
        int i = 1, p = 0;
        while (true) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                p++;
                System.out.println(p + " = Prime Number :- " + i);
                if (p == no) {
                    break;
                }
            }
            i++;
        }
    }
}
