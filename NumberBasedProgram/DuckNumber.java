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
public class DuckNumber {
    void duck(int p)
    {   System.out.println(p);
        int no=p;
        int r,value=0;
        int last=0,count=0;
        while(no>0)
        { 
            last=0;
            r=no%10;
            value=value*10+r;
            
            last=r;
            if(r==0)
            {
                count=1;
            }
            no=no/10;
        }
         if(count==1){
            if(last!=0)
            System.out.println("Entered number is Duck Number");
            else
            System.out.println("Entered number is not Duck Number");
        }
        else
            System.out.println("Entered number is not Duck Number");
        
    }
    void checkduck(int n)
    {
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        DuckNumber abc=new DuckNumber();
        System.out.print("\nEnter Any Number :");
        no=sc.nextInt();
        abc.duck(no);
        
    }
}
