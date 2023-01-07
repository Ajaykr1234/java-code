import java.util.Scanner;

import javax.xml.transform.SourceLocator;

import java.util.*;

public class voteegibilty {
    public static void agecriteria(int a){
   
        if(a>=18){
            System.out.println("right for vote");
        }
        else{
        System.out.println("not eligible for vote");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int a = sc.nextInt();
       agecriteria(a) ;
    }
    
}
