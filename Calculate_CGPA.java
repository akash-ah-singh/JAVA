package Practice_Set_1;
import java.util.Scanner;

public class Calculate_CGPA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Calculate % of three Subjects :");
        Scanner sc= new Scanner(System.in);

        System.out.println("enter first subject number:");
        float a=sc.nextInt();

        System.out.println("enter Second subject number:");
        float b=sc.nextInt();

        System.out.println("enter third subject number:");
        float c=sc.nextInt();

        float Sum= a+b+c;
        float Percentage= (Sum/3);

        System.out.println("Percentage of all three subjects is:");
        System.out.println(Percentage);

    }

    
}

