package Practice_Set_1;

import java.util.Scanner;

public class Hello_Greet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		System.out.println("Enter three Numbers :");
        Scanner sc= new Scanner(System.in);
        System.out.println("What is ur name :");
        String name=sc.nextLine();

//        String name=sc.next();  ---------->(just print name without space)

        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(" Have a good day");


    }

}
