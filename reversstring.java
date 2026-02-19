import java.util.Scanner;

public class reversstring {
 
    
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in) ;

    System.out.println("Enter the string");

   String str = sc.nextLine();

// itna toh same hai sbhi meh logic are main 
 String rev="";
  
   for (int i = str.length ()-1; i>=0 ; i--){

    rev = rev + str.charAt(i);
   }
// yaha tak buss

   System.out.println("Reversed string "+ rev);
}


}
