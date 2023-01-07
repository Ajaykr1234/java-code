import javax.annotation.processing.SupportedOptions;

public class searchnew {
    public static void main(String[] args) {
        int [] marks = {132,5,86,56,79,2};
        int a = marks[0];
        for (int i= 1; i < marks.length; i++){
            
            if (marks[i] > a){
                a= marks[i];
            }
        if(marks[i]==a){
            // System.out.println( "this is yr least no =" +i);
        }
        }
        System.out.print("this is yr max no = "+a);
        // System.out.println(a);
    }
}