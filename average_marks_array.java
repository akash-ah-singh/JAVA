package Practice_Set_6;

public class average_marks_array {
    public static void main(String[] args) {

        float[] marks={45,67,78,89,90};
        float average;
        float sum=0;

        for(float elements:marks){
            sum=sum+elements;
        }
        average=sum/marks.length;
        System.out.println(average);

        
        
    }
}
