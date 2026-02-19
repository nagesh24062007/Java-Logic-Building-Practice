// import java.util.Scanner;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the no");
//         int num = sc.nextInt();
//         int temp = num, rev = 0;

//         // Reverse logic
//         while (temp != 0) {
//             int digit = temp % 10;
//             rev = rev + digit;
//             temp = temp / 10;
//         }
// if (rev== num){
//     System.out.println("its planidromne" +num);

// }else{
//     System.out.println("its not planidrome"+  num);
// }
 

//     }
// }
import java.util.*;

 public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, rev = 0;

        // Reverse logic
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev + digit;
            temp = temp / 10;
        }

        if (rev == num)
            System.out.println(num + " is Palindrome.");
        else
            System.out.println(num + " is NOT Palindrome.");
    }
}
