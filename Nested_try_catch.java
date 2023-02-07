package Chap_14;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {

        int[] arr=new int[3];
        arr[0]=12;
        arr[1]=24;
        arr[2]=48;

        Scanner sc=new Scanner(System.in);

        boolean flag=true;

        while(flag){

            try{
                System.out.println("welcome to nested try_catch !!! ");
                System.out.println("enter ur index number : ");
                int index=sc.nextInt();

                try {
                    System.out.println("The element at index is "+arr[index]);
                    flag=false;
                }

                catch(IndexOutOfBoundsException e){
                    System.out.println("IndexOutOfBoundsException found !!! ");
                    System.out.println(e);
                    System.out.println("Exception at level 2 found");
                }

            }

            catch (Exception e){
                System.out.println("Exception at level 1 found ");
            }

        }


    }
}




