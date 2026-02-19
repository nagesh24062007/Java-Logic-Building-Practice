import java.util.Scanner;

public class patterpyarmid{

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("enter the numbers");
    int n = sc.nextInt();

for (int i = n ; i >= 1 ;i--){

    for(int space = 1 ; space < i; space ++){

        System.out.println("");

    }

    for (int j = i ; j <= n ;j++){
        System.out.println(j);
    }
}

}

}