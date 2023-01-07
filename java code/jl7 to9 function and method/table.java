import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class table {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your table no = ");
        int n= sc.nextInt();
        
        for(int i=1; i<=10; i++){
        
            int m = i*n;
            System.out.println(m);   
        }
      
       

    }
        
    
}
