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

public class CircluarPrimeNumber {
    
    static int no, count=0;
    static int numberCount(int no){
        while(no>0){
            count++;
            no=no/10;
        }
        return count;
    }
    static int counter(int a)
    {
        int value=0,sum=0,c=1,rem=0;
        while(a>0){
            if(c==1){
            rem = a % 10;
            sum=(sum*10)+rem;
            a=a/10;
            value = a;
            c++;
            }
            else{
                sum=sum*10;
                a=a/10;
            } 
        }
        value = value+sum;
        return value;
    }
    static boolean prime(int no){
        int countp=0;
        for(int i=1;i<=no;i++){
            if(no%i==0){
                countp++;
            }
        }
        if(countp == 2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
       int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number here - "); 
        no = sc.nextInt();
        b=no;
        int countNo = numberCount(no);
//        b= counter(b);
        for(int i=0;i<countNo-1;i++){
            boolean flag = prime(b);
            if(flag == true)
                b = counter(b);
            else{
                System.out.println(b+" is not prime no show "+no+" is not Circular Prime Number");
                break;
            }
            System.out.println(i+"  Numberiiiiiiiii");
                System.out.println(countNo+"  Numbercccccccccc");
            if(countNo-2==i){
                System.out.println(no+" is Circular Prime Number");
                System.out.println(i+"  Numberiiiiiiiii");
                System.out.println(countNo+"  Numbercccccccccc");
            }
        }
    }
    
}
