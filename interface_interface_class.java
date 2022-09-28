package Practice_Set_11;

public class interface_interface_class {
    public static void main(String[] args) {

        TV tv=new TV();
        tv.smartTV();
        tv.Tv();

    }
}


interface SmartTVremote{
    void smartTV();
}


interface tvRemote extends SmartTVremote{
    void Tv();
}

class TV implements tvRemote{

    public void smartTV(){
        System.out.println("SmartTV ...");
    }

    public void Tv(){
        System.out.println("TV ...");
    }

}