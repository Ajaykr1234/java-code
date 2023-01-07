public class builderhh {public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("ajaykumar");
    System.out.println(sb);



    //for print any char 
    System.out.println(sb.charAt(5));



    // for set index (replacing) any word
    sb.setCharAt(0, 'A');
    System.out.println(sb);



    //insert (means re arrage)
    sb.insert(0, 'j');
    System.out.println(sb);
    //2nd method of insert
    sb.insert(3, 'j');


//deleting the extra word
sb.delete(9, 10);
System.out.println(sb);
}
    
}
