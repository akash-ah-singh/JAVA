package Practice_Set_10;

import java.util.Scanner;


class circle{

      int radius;
      int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void areaOfCircle(){
        double Area=Math.PI*radius*radius;
        System.out.println("Area of circle is : "+Area);

    }

}

class cylinder extends circle{

        public void areaOfCylinder(){
           double Area=(2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
            System.out.println("Area of Cylinder is : "+Area);
        }

        public void volume(){
           double Volume=Math.PI*radius*radius*height;
            System.out.println("Volume of Cylinder is : "+Volume);
        }

    }


public class Circle_Cylinder_inheritance {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter radius : ");
        int radius=in.nextInt();

        System.out.println("Enter height : ");
        int height=in.nextInt();

//        circle ce =new circle();
//        ce.areaOfCircle(radius);


        cylinder cr=new cylinder();
        cr.setRadius(radius);
        cr.setHeight(height);

//        System.out.println(cr.getRadius());
//        System.out.println(cr.getHeight());

        cr.areaOfCircle();
        cr.areaOfCylinder();
        cr.volume();



    }
}
