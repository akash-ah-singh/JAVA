package Practice_Set_4;

import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter All three subjects numbers :");

        System.out.println("Enter 1st subject numbers :");
        float a=sc.nextInt();

        System.out.println("Enter 2nd subject numbers :");
        float b=sc.nextInt();

        System.out.println("Enter 3rd subject numbers :");
        float c=sc.nextInt();

        float Sum= (a+b+c)/3;
        boolean d=Sum>=33 || Sum>=40;

        if(d)
            System.out.println("Pass");
        else
            System.out.println("Fail");


    }


}
