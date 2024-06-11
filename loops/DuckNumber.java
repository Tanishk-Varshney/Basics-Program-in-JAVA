/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author vibha
 */
public class DuckNumber {
    
    public static void main(String args[]){
        int no, remd, value = 0, count=0, last=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number - ");
        no = sc.nextInt();
        while(no>0){
            last = 0;
            remd = no % 10;
            last = remd;
            value = value * 10 + remd;
            if(remd == 0){
                count = 1;
            }
            no = no/10;
        }
        if(count == 1){
            if(last != 0){
               System.out.println("Duck Number"); 
            }
            else{
                System.out.println("Not Duck Number");
            }
        }else{
            System.out.println("Not Duck Number");
        }
    }
}
