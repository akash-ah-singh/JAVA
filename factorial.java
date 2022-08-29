package Practice_Set_5;

public class factorial {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int fact=1;
        while(i<=n){
            fact=i*fact;
            i++;
        }
        System.out.println(fact);
    }
    
}
