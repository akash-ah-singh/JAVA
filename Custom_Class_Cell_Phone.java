package Practice_Set_8;
import java.util.Scanner;

class cellPhone{

    public void ring(){
        System.out.println("ringing...");
    }

    public void vibrate(){
        System.out.println("vibrating...");
    }

}

public class Custom_Class_Cell_Phone {
    public static void main(String[] args) {

        cellPhone pin=new cellPhone();
        pin.ring();
        pin.vibrate();


    }
}
