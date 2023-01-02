package Practice_Set_13;

public class currentThread {
    public static void main(String[] args) {

        Thr9 a9=new Thr9();
        Thr10 a10=new Thr10();

        a9.start();
        a10.start();

        System.out.println("State of Thread Thr9 is " + Thread.currentThread().getState());
        System.out.println("State of Thread Thr10 is " + Thread.currentThread().getState());

    }
}


class Thr9 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");

            i++;
        }

    }
}


class Thr10 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good morning" );
            i++;
        }

    }
}