package Practice_Set_11;

public class class_and_interface {
    public static void main(String[] args) {

        human hn=new human();
        hn.jump();
        hn.eat();
        hn.bite();
        hn.sleep();

//        monkey my=new human();
//        my.jump();
//        my.bite();
////        my.eat(); //error
////        my.sleep(); //error

    }
}



class monkey{
    void jump(){
        System.out.println("Jumping ...");
    }
    void bite(){
        System.out.println("bitting ...");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}


class human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("eating ...");
    }

    public void sleep(){
        System.out.println("Sleeping ...");
    }
}