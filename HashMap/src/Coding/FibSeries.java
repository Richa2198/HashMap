package Coding;

public class FibSeries {
    public static void main(String[] args) {
        fibSeries(200);
    }

    private static void fibSeries(int i) {
        if(i<2){
            System.out.println("0");
        }
        if(i<7){
            System.out.println("0"+","+"2");
        }
        int f1=2;
        int f2=0;

        System.out.print("0"+","+f1);
        while(true){
            int t = 4*f1+f2;
            if(t<=i) {
                System.out.print(",");
                System.out.print(t);
            }
            else break;
            f2=f1;
            f1=t;
        }
    }
}
