import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class grethantwono {
    public static int greatno(int a, int b){
        if(a>b){
       
return a;
        }
        else{
     return b;
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter your 1st no = ");
        int a = sc.nextInt();
        System.out.print("enter your 2nd no = ");
        int b = sc.nextInt();
        System.out.print("greater no = ");
System.out.println(greatno(a, b));
    }
    
}
