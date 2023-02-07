package Chap_14;

public class try_catch_block {
    public static void main(String[] args) {
        int a=1000;

//      WITH EXCEPTIONS

        int b=0;
        try{
            int c=a/b;
            System.out.println(c);

        }
        catch (Exception e){
            System.out.println("Here we wil get an exception which is ");
            System.out.println(e);

        }










//        WITHOUT EXCEPTIONS

//        int b=5;
//        int c=a/b;
//        System.out.println(c);



    }
}
