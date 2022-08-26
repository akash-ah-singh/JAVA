package Practice_Set_5;

public class Sum_first_N_EvenNumber {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while(i<=5){
            sum=(2*i)+sum;
            i++;
        }
        System.out.print("sum of first n even number : " );
        System.out.print(sum);


    }
}

