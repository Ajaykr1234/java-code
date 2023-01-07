import java.util.Scanner;

public class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st no = ");
        int n1 = sc.nextInt();
        System.out.print("Enter your 2nd no = ");
        int n2 = sc.nextInt();
        while(n1 != n2) {
        if(n1>n2) {         
        n1 = n1 - n2;
        } else {
        n2 = n2 - n1;
        }
        }
        
        System.out.println("GCD is : "+ n2);
    
}
}
