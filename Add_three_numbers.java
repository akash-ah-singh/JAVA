package Practice_Set_1;
import java.util.Scanner;

public class Add_three_numbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter three Numbers :");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number");
        int a= sc.nextInt();
        System.out.println("Enter Second number");
        int b= sc.nextInt();
        System.out.println("Enter Third number");
        int c= sc.nextInt();

        int Sum=a+b+c;
        System.out.println("Sum of all there three numbers is");
        System.out.println(Sum);

    }

}

