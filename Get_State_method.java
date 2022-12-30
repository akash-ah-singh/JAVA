package Practice_Set_13;

public class Get_State_method {
    public static void main(String[] args) {

        Thr7 a7=new Thr7();
        Thr8 a8=new Thr8();

        a7.start();
        a8.start();

        System.out.println("State of Thread Thr7 is " + a7.getState());
        System.out.println("State of Thread Thr8 is " + a8.getState());
    }
}


class Thr7 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");

            i++;
        }

    }
}


class Thr8 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good morning" );
            i++;
        }

    }
}