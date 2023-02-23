package Chap_15;
import java.util.Date;

public class Date_nd_Time_in_Collections {
    public static void main(String[] args) {

        //Date

        Date d=new Date(); // to print date nd time we have to create date class .
        System.out.println(d); // it will print current date and time .
        System.out.println(d.getTime()); // it will give time in millisecond

        System.out.println(d.getDate()); // Depericated Method
        System.out.println(d.getDay()); // Depericated Method
        System.out.println(d.getHours());  // Depericated Method
        System.out.println(d.getMonth()); // Depericated Method
        System.out.println(d.getMinutes());  // Depericated Method
        System.out.println(d.getSeconds()); // Depericated Method
        System.out.println(d.getYear()); // Depericated Method
        System.out.println(d.getTimezoneOffset()); // Depericated Method



        //Time

        System.out.print("Maximum long value can be stored in a long variable : ");
        System.out.println(Long.MAX_VALUE);
        System.out.print("Current time in  milli Second : ");
        System.out.println(System.currentTimeMillis());
        System.out.print("Current time in Second : ");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.print("Current time in Hour : ");
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.print("Current time in Days : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.print("Current time in Years : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

    }

}
