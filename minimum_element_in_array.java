package Practice_Set_6;

public class minimum_element_in_array {
    public static void main(String[] args) {

        int [] arr={34,23,67,56,45};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(min);

    }
}
