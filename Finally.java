package Chap_14;

public class Finally {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1; // return -1 or 0 or 1  no matter
    }




    public static void main(String[] args) {

                int k = greet();
                System.out.println(k);



                int a = 7;
                int b = 0;
                while(true){
                    try{
                        System.out.println(a/b);
                    }
                    catch (Exception e){
                        System.out.println(e);
                        break;
                    }
                    finally{ // finally will execute even the loop breaks above
                        System.out.println("I am finally for value of b = " + b);
                    }
                    b--;
                }






                try{
                    System.out.println(50/3);
                }
                finally {  //we can write finally block with try
                    System.out.println("Yes this is finally");
                }


            }
        }

