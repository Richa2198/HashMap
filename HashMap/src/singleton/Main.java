package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton x = Singleton.a();
        Singleton y = Singleton.a();
        Singleton z = Singleton.a();

        System.out.println("Hashcode of x: "+ x.hashCode());
        System.out.println("Hashcode of y: "+ y.hashCode());
        System.out.println("Hashcode of z: "+ z.hashCode());

        if(x==y && y==z){
            System.out.println("All pointing to same object");
        }

    }
}
