package Practice_Set_7;
import java.util.Scanner;
public class method_multiplication {

    static int mul(int x) {
        int mult = 1;
        for (int i = 1; i <=10; i++) {
            mult = x * i;
            System.out.printf("table of 5 is %d * %d = ",x,i);
            System.out.println(mult);
        }
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to get the tabel of that number :");
        int n=sc.nextInt();

        mul(n);

        }

    }

