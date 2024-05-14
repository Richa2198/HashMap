package InterfaceConcept;

public class Main {
    public static void main(String[] args) {
        myInterface i = new A();
        myInterface2 j = new A();

        A a = new A();
        int sum = i.sum(4, 5);
        System.out.println(sum);
        int sum1 = a.sum(6, 7);
        System.out.println(sum1);
        a.print();


    }
}
