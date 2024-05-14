package InterfaceConcept;

public class A implements myInterface,myInterface2{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
    public void print(){
        System.out.println("hi");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping");
    }
}
