package Practice_Set_7;
import java.util.Scanner;

public class method_Pattern_in_reverse_order {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any number to print reverse pattern : ");
        int n=input.nextInt();

        reverse_pattern(n);
    }

    static void reverse_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
         
            System.out.println();
        }
    }
}
