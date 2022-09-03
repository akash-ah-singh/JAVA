package Practice_Set_9;


//Custom class

class Cylinder{
    private  int radius;
    private int height;


    // Constructor

    public Cylinder(){
        radius=5;
        height=3;
    }

    //getter and setter

    public  void setRadius(int r){
        radius=r;

    }
    public  int getRadius(){
        return radius;

    }
    public  void setHeight(int h){
        height=h;

    }
    public int getHeight(){
        return height;
    }


    // methods to calculate Surface Area and Volume of Cylinder in custom class

    public void surfaceArea(){
        double SA=(2*3.14*radius*height)+(2*3.14*radius*radius);
        System.out.println("Surface Area = "+SA);
    }

    public void  volume(){
        double vol=(3.14*radius*radius*height);
        System.out.println("Volume = "+vol);

    }
}


// default class

public class getterANDSett_and_Constructor {

    public static void main(String[] args) {
        Cylinder sc=new Cylinder();
//        sc.setRadius(6);
//        sc.setHeight(3);
        System.out.println("Height = " +sc.getHeight());
        System.out.println("Radius = " +sc.getRadius());
        sc.surfaceArea();
        sc.volume();

    }
}


