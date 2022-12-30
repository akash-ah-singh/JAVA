package Practice_Set_13;

public class Using_Thread {
    public static void main(String[] args) {
        Thr1 a1=new Thr1();
        Thr2 a2=new Thr2();
        a1.start();
        a2.start();


    }



}

class Thr1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good morning");

        }

    }
}


class Thr2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Welcome");

        }

    }
}
