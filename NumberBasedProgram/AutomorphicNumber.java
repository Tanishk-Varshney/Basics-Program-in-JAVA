/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberBasedProgram;


import java.util.Scanner;

public class AutomorphicNumber {
    static int temp,r,num=0,c=0,n,sum,r1,s1,count,s2=0,s3=0;
    static int rev(int p)
    {
        count=1;
        s1=0;
        while(p>0)
        {
            r1=p%10;
            s1=(s1*10)+r1;
            p=p/10;
            
            if(count==c)
                break;
            count++;
        }
        return s1;
    }
    static void checkAutoNum(int no)
    {
        sum=no*no;
        s2=rev(sum);
        s3=rev(s2);
        if(temp==s3)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
    public static void main(String agrs[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To check:- ");
        n= sc.nextInt();
        temp=n;
        while(n>0)
        {
            n=n/10;
            c++;
            
        }
        checkAutoNum(temp);
            
    }
    
}
