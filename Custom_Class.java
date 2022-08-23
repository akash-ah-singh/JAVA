package Practice_Set_8;
import java.util.Scanner;


class employee{
    int salary;
    String name;

    public int getSalary(){

       return salary;
    }
    public String getName(){
        return name;

    }
    public void setName(String n){
        name=n;

    }

}



public class Custom_Class {

    public static void main(String[] args) {
        employee pin=new employee();

        pin.salary=45000;
        pin.setName("Akash Singh");

        System.out.println("My Name is "+pin.getName());

        System.out.println("and my salary is "+pin.getSalary());
        


    }
}
