package Practice_Set_6;

public class find_int_in_array {
    public static void main(String[] args) {

        int[] marks={56,67,78,89,90};
        int find=56;
        boolean IsInArray=false;

        for(int i=0;i<marks.length;i++){
            if(find==marks[i]){
                IsInArray=true;
                break;
            }
        }
        if(IsInArray){
            System.out.println("element is in array");
        }
        else{
            System.out.println("element is not in array");
        }

    }
}
