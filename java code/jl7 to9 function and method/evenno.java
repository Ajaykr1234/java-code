import java.util.Scanner;

public class evenno {
    public static void evenno(int n) {
     int sum=0;   
    for(int i=0; i<=n; i+=2){
     sum =sum+i;

    }
    System.out.println(sum);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no = ");
        int n= sc.nextInt();
        System.out.print("add of your even no = ");
        evenno(n);


    }
    
    
}
