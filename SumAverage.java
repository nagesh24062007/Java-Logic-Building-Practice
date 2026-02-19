import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the 10 numbers");
    int sum=0;
    int[] arr = new int [10];

    for( int i =0; i<10;i++){
        arr[i] = sc.nextInt();
        sum = sum + arr[i];

    }
       double average = sum/10.0;
       
       System.out.println(sum);
       System.out.println(average);

sc.close(); 
    }
}
