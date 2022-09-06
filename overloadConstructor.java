package Practice_Set_9;

class Overload{
    private int length;
    private int width;

    public Overload(){
        length =23;
        width=12;
    }

    public void setLength(int l){
        length=l;
    }

    public void setWidth(int w) {
        width = w;
    }


    public void rectangle(){
        int area=length*width;
        System.out.println("rectangle area = "+area);
    }
}

public class overloadConstructor {
    public static void main(String[] args) {

        Overload sc=new Overload();

//        sc.setLength(13);
//        sc.setWidth(12);

        sc.rectangle();

    }
}
