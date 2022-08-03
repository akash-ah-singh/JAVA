package Practice_Set_7;

public class method_Sum_of_N_natural_number {
    public static void main(String[] args) {

        System.out.println(Sum(10));

    }

    static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;

    }




}
