package Practice_Set_11;

public class abstract_class {
    public static void main(String[] args) {

        fountainPen fp=new fountainPen();
        fp.changeNib();
        fp.refill();
        fp.write();

//        pen pe=new fountainPen();
//        pe.refill();
//        pe.write();
////      pe.changeNib(); // gives an error because---> abstract class reference variable not able to access concreet class method.

    }
}



abstract class pen{
    abstract void write();
    abstract void refill();
}



class fountainPen extends pen{
    @Override
    void write(){
        System.out.println("writting ...");
    }
    @Override
    void refill(){
        System.out.println("refilling ...");
    }

    void changeNib(){
        System.out.println("Changing nib ...");
    }
}