package Practice_Set_5;

public class natural_number {

    public static void main(String[] args) {

        System.out.println("Using Do-while loop : ");

        int p=1;
        do{
            System.out.println(p);
            p++;
        }while(p<=25);



        System.out.println("Using while loop : ");

        int i=100;
        while(i<=200){
            System.out.println(i);
            i++;
        }

        System.out.println("natural number in reverse order : ");

        for(int x=50;x>0; x--){
            System.out.println(x);
        }
    }

}
