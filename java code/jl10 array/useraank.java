import java.util.Scanner;

public class useraank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your size lenth = ");
        int size = sc.nextInt();
        int [] num =new int[size];
        //input
        for(int i=0; i<size; i++){
       num[i] = sc.nextInt();
       
        }
        System.out.print("this is your return value =");
        //optput
        for(int i=0; i<=size; i++){
            System.out.println(num[i]);

        }
       

    }
    
}
