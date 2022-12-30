package Practice_Set_13;

public class Get_priority_Set_Priority_Method {
    public static void main(String[] args) {

        Thr5 a5=new Thr5();
        Thr6 a6=new Thr6();

        a5.setPriority(Thread.MAX_PRIORITY);
        a6.setPriority(Thread.MIN_PRIORITY);

        a5.start();
        a6.start();

        System.out.println("Priority of thread Thr5 is " + a5.getPriority());
        System.out.println("Priority of thread Thr6 is " + a6.getPriority());


    }
}



class Thr5 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");

            i++;
        }

    }
}


class Thr6 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good morning" );
            i++;
        }

    }
}