import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 1 subjects:");
        int sub1= sc.nextInt();
        System.out.println("enter marks of s2 sunject");
        int sub2= sc.nextInt();
        System.out.println("enter the maraks odf sub3 ");
        int sub3 = sc.nextInt();
        System.out.println("enter thw marks of sub4");
        int sub4 =sc.nextInt();
        int sum ,avg=0,percentage=0;
         sum= sub1+ sub2+sub3+sub4;
       //  avg= sum/4;
         percentage= sum/500;
         System.out.println("the total marks obtainted"+ sum);
         System.out.println("the percaetange are obtainted"+ percentage);
    }
}
