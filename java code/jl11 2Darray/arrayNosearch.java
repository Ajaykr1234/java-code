import java.util.Scanner;

public class arrayNosearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your rows  no = ");
        int rows = sc.nextInt();
        System.out.print("enter your coloum no = ");
        int cols = sc.nextInt();
        int[][] Number = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0;  j<cols;  j++){
                Number[i][j]=sc.nextInt();

            }
            System.out.print("enter your search no = ");
            int x = sc.nextInt();
            for(int p=0; i<rows; i++){
             for(int j=0; j<cols; j++){
                System.out.println("x is found("+ i +" ,"+ j +" )");
             }

            }


        }
    }
    
}
