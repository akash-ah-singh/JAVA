package Chap_14;

import java.util.Scanner;
public class Handling_Specific_Exceptions {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur index number : ");
        int index=sc.nextInt();
        System.out.println("Enter ur number : ");
        int num=sc.nextInt();



        int[] arr=new int[3];
        arr[0]=12;
        arr[1]=24;
        arr[2]=48;

        try {
            System.out.println("The result is : "+ arr[index]/num);

        }

        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBounds Exception found !!! ");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception found !!! ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception found !!! ");
            System.out.println(e);
        }

    }
}
