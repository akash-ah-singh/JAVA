package Practice_Set_7;
import java.util.Scanner;
public class method_pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number to print pattern : ");
        int n=input.nextInt();

        pattern(n);

    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
//        return;

    }
}
