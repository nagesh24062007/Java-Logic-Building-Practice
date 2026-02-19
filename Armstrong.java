
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;   // for 3-digit Armstrong
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is Armstrong.");
        else
            System.out.println(num + " is NOT Armstrong.");
        sc.close();
    }
}


// psuedocode:
// public class Armstrong{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Prompt user for input
//         print "Enter a number: "
//         read num

//         // Initialize variables
//         temp = num
//         sum = 0

//         // Calculate sum of cubes of digits
//         while temp is not 0 do
//             digit = temp mod 10
//             sum = sum + (digit * digit * digit)
//             temp = temp divided by 10
//         end while

//         // Check if the number is Armstrong
//         if sum equals num then
//             print num + " is Armstrong."
//         else
//             print num + " is NOT Armstrong."
//         end if

//         sc.close()
//     }
// }