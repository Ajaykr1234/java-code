import java.util.Scanner;

public class collegedata {
    public static void main(String[] args) {
        System.out.println(" Enter your data list");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] marks = new int[a];
        for(int i=0; i<a; i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0; i<a; i++){
            System.out.print(marks[i]);
        }
    }
    
}
