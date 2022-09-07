package Practice_Set_3;

import java.util.Scanner;

public class replace2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any name:");
        String a=sc.nextLine();

        String name="Dear <|name|> , thanx a lot";

        System.out.println(name.replace("<|name|>", a ));

    }
}
