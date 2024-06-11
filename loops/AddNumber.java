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
public class AddNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        System.out.println("Enten the value which you want the Addition:- ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            count=count+i;
        }
        System.out.println("Total = "+count);
    }
}
