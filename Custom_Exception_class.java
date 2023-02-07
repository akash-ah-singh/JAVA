package Chap_14;

import java.util.Scanner;

class MYExp1 extends Exception{

    @Override
    public String toString() {
        return "Age Should Be grater than 18 ";
    }

    @Override
    public String getMessage() {
        return "Your age is not greater than 18";
    }
}


public class Custom_Exception_class {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int a= sc.nextInt();
        if(a<=18){
            try {
                throw new MYExp1(); // when we use custom exception... we have to use throw keyword to access that custom exception class
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);  // it will throw your first method message of Your " MYExp Class "
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Your Entered age is greater than 18");


        }

    }
}
