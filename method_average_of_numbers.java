package Practice_Set_7;
import java.util.Scanner;
public class method_average_of_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter multiple numbers : ");
        int n=input.nextInt();
        int[] arr=new int[n];

        System.out.println(average(arr));

    }
    static int average(int...d ){
        int sum=0;
        for(int i=0;i<d.length;i++){
            sum=sum+d[i];

        }
//        System.out.println(sum);
        return sum;


    }

}
