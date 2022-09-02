package Practice_Set_9;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

  static void GuessNumber(int n2){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your guess number : ");

        int temp = 0;
        while (true) {
            int n1 = in.nextInt();

            if (n1 == n2) {
                System.out.println("Right guess");
                temp+=1;
                System.out.println("Total number of guess = " + temp);
                break;
            }
            else if (n1 < n2) {
                System.out.println("Low guess");
                temp += 1;
            } else {
                System.out.println("High guess");
                temp += 1;
            }


        }
    }


    public static void main(String[] args) {

        Random sc = new Random();
        int n2 = sc.nextInt(101);

       GuessNumber(n2);

    }
}



