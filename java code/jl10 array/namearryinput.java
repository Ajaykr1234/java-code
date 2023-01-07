import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class namearryinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your letter no = ");
        int a = sc.nextInt();
        String[] name = new String[a];
        for(int i=0; i<a; i++ ){
            name[i]=sc.next();
        }
        for( int i=0; i<name.length; i++){
            System.out.print(name[i]);
        }
    }
    
}
