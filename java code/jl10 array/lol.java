import java.util.Scanner;

import javax.lang.model.element.Element;

import java.util.*;

public class lol {
    public static void main(String[] args) {
       
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int[] marks = new int[a];
        
        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }

int max = Integer.MAX_VALUE;

int min = Integer.MIN_VALUE;

       for(int i=0; i<marks.length; i++){
        if(marks[i]<min){
         min=marks[i];
        }
        if(marks[i]>max){
          max= marks[i];
        }
    }
    System.out.println("this is your max value = " +max);
    System.out.println("this is your min vlaue = "+min);
}
}
        
