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
public class VowelConsonent {
    public static void main(String args[])
    {
        System.out.print("\nEnter the Character:- ");
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("\nVowel");
        }
        else
            System.out.println("\nConsonent");
    }
}
