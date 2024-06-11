/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramsofmca;

/**
 *
 * @author tnny2
 */
import java.util.Scanner;
public class Grade {
    int e,h,m,p,c,total,mak;
    double pert;
    Scanner sc = new Scanner(System.in);
    int marks()
    {
        System.out.print("\nEnter Marks of English:");
        e=sc.nextInt();
        System.out.print("\nEnter Marks of Hindi:");
        h=sc.nextInt();
        System.out.print("\nEnter Marks of Mathmatics:");
        m=sc.nextInt();
        System.out.print("\nEnter Marks of Physics:");
        p=sc.nextInt();
        System.out.print("\nEnter Marks of Chemistry:");
        c=sc.nextInt();
        total=e+h+m+p+c;
        System.out.print("\nTotal Marks : "+total);
        
        return total;
    }
    void gradeN(int mak)
    {
        this.mak=mak;
        pert = mak/5;
        if(pert>90)
        {
            System.out.println("You have A+ Grade");
        }
        else if(pert>80 && pert<90)
        {
            System.out.println("You have A Grade");
        }
        else if(pert>70 && pert <80)
        {
            System.out.println("You have B Grade");
        }
        else if(pert>60 && pert <70)
        {
            System.out.println("You have C Grade");
        }
        else if(pert>50 && pert <60)
        {
            System.out.println("You have D Grade\n");
        }
        else
            System.out.println("You are Failed");
        
        
    }
    
    public static void main(String args[])
    {
        Grade ob = new Grade();
        int tm=ob.marks();
        ob.gradeN(tm);
        
    }
}
