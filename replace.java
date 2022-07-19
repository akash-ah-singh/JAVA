package Practice_Set_3;
import java.util.Scanner;

public class replace {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any name with Spaces :");
        String name=sc.nextLine();

        System.out.println(name.replace(' ','_'));

    }

}


