package jl7;

import java.util.Scanner;

public class name {
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name = ");
     String name = sc.nextLine();
     printMyName(name);
        
    }
    
}
