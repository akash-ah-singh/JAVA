package Practice_Set_6;

public class array_sorted_or_not {
    public static void main(String[] args) {

        int[] arr={67,77,53,88,99};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
//




//Sorted Array


//
//        int[] arr={1,2,3,4,5};
//        boolean isSorted=true;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("array is sorted");
//        }
//        else{
//            System.out.println("array is not sorted");
//        }






//boaring way

//        int[] arr={1,2,3,4,5};
//        int sorted=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>sorted){
//                sorted=arr[i];
//            }
//            else{
//                break;
//            }
//
//        }
//        if(sorted==arr[4]){
//            System.out.println("array is sorted");
//        }
//        else{
//            System.out.println("array is not sorted");
//        }
//        System.out.println("array is sorted");
//        System.out.println("condition terminated at :"+" " +sorted);



    }
}
