/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

/**
 *
 * @author vibha
 */
import java.util.Scanner;
public class GetNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enten the value where you want the number:- ");
        n=sc.nextInt();

//-------------For Loop----------------------------
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println(i);
//        }


//-------------While Loop--------------------------
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
