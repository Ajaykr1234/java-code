import java.util.Scanner;

public class ajarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your row no = ");
        int rows =sc.nextInt();
        System.out.print("enter your coloumn no = ");
        int cols= sc.nextInt();
        int[][]Number= new int[rows][cols];
    //  inpute
    // row
    for(int i=0; i<rows; i++){
        // clos
        for(int j=0; j<cols; j++){
           Number[i][j]=sc.nextInt();
        }
    }
    // output
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(Number[i][j]+ " ") ;
        }
        System.out.println();
    }
    }
    
}
