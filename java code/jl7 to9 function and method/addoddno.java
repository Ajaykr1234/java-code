// package jl7;
import java.util.*;

public class addoddno {
    public static void add1ton(int n) {
         int sum =0;
        for( int i=1; i<=n; i+=2){
          sum = sum+i;
        

        }
        System.out.println(sum); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter your no = ");
    int n = sc.nextInt();
    System.out.print("result = ");
    add1ton(n);   
        
    }
    
}
