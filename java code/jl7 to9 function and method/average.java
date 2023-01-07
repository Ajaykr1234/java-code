package jl7;
import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class average {
    public static float printofaverage(Float a,Float b, Float c){
        float average = (a+b+c)/3;
        System.out.println(average);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your 1st no =");
        float a = sc.nextFloat();
        System.out.print("enter your 2nd no = ");
        float b = sc.nextFloat();
        System.out.print("enter your 3rd no =");
        float c= sc.nextFloat();
        System.out.print("average of no = ");
        printofaverage(a, b, c);
        
    }
    
}
