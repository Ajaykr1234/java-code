package jl7;

import java.util.Scanner;

public class multilpe {
    public static int gunna(int a , int b){
        int mul = a*b;
        System.out.println(mul);
        return mul;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no = ");
        int a = sc.nextInt();
        System.out.print("enter your no = ");
        int b = sc.nextInt();
        System.out.print("the product of teo no = ");
        int mul = gunna(a, b);
       

        
    }
    
}
