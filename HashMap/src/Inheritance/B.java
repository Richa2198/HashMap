package Inheritance;

public class B extends A{

    @Override
    public void gogo() {
        super.gogo();
        System.out.println("I am gogo of B");
    }

    public void bubu(){
        System.out.println("I am bubu");
    }
    public void tutu(){
        System.out.println("I am tutu");
    }
}
