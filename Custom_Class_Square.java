package Practice_Set_8;
import java.util.Scanner;


class square{
    int side;
    public int area(){
        int squareArea=side*side;
        return squareArea;


    }
    public int perimeter(){
        int perimeterOfSquare=4*side;
        return perimeterOfSquare;

    }
}

public class Custom_Class_Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter side of Square : ");

        square pin=new square();
        pin.side=in.nextInt();


        System.out.println("Area of Square is : "+pin.area());
        System.out.println("Perimeter of Square is : "+pin.perimeter());


    }
}
