import java.util.Scanner;

public class factorofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entr your positive no = ");
        int n = sc.nextInt();
        System.out.print("facor of "+n+ " are:");
        for(int i=1; i<=n; i++){
            if(n%i==0){
               
                System.out.print( i + " ");     
            }
          
        }
        
    }
    
}
