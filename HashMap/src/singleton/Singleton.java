package singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        //"private constructor";
    }
    public static Singleton a(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
