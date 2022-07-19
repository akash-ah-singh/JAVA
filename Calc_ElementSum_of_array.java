package Practice_Set_6;

import java.sql.SQLOutput;

public class Calc_ElementSum_of_array {
    public static void main(String[] args) {

        float[] marks ={55.4f,67.6f,45.3f,78.8f,89.9f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];

        }
        System.out.println(sum);


    }
}
