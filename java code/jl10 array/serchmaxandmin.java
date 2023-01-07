import java.util.Scanner;
import java.util.*;

public class serchmaxandmin {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(String.in);
        int a = sc.nextInt();
        int[] marks = new int[a];
        for(int i=0; i<a; i++){
            marks[i]=sc.nextInt();
        }
       for(int i=0; i<a; i++){
        System.out.println(marks[i]);
       } 
    }
    
}
