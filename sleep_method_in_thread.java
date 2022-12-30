package Practice_Set_13;

public class sleep_method_in_thread {
    public static void main(String[] args) {
        Thr3 a3=new Thr3();
        Thr4 a4=new Thr4();
        a3.start();
        a4.start();

    }
}


class Thr3 extends Thread{
    @Override
    public void run(){
        while(true){
        System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


class Thr4 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good morning" );

        }

    }
}