package Chap_14;
class NegativeRadiusExp extends Exception{
    @Override
    public String toString(){
        return "Radius can't be Negative";

    }
}
public class throw_and_throws {

     static double area(int r) throws NegativeRadiusExp{
        if(r<0){
            throw new NegativeRadiusExp();
        }
        double res=3.14 * r * r;
        return res;
    }

    public static void main(String[] args) {
            try{
//                double ar= area(-1);
                double ar= area(6);

                System.out.println(ar);
            }
            catch (Exception e){
                System.out.println(e.toString());
            }

        }
    }

