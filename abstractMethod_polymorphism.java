package Practice_Set_11;

public class abstractMethod_polymorphism {
    public static void main(String[] args) {

        telephone te=new SmartPhone();
        te.ring();
        te.lift();
        te.disconnect();
//        te.smart(); //error  //perform polymorphism

        SmartPhone se=new SmartPhone();
        se.ring();
        se.lift();
        se.disconnect();
        se.smart();

    }


}


abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}



class SmartPhone extends telephone{
    void smart(){
        System.out.println("My smartPhone");
    }

    void ring(){
        System.out.println("ringing ...");
    }

    void lift(){
        System.out.println("lifting ...");
    }

    void disconnect(){
        System.out.println("disconnecting ...");
    }

}