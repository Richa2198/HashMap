package ExceptionHandling;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("outer");
                int b = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println("arithmeticException");
            }
            try{
                int a[] = new int[5];
                a[5]= 4;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("arrayindex");
            }
            System.out.println("i m in inner");
        }
        catch(Exception e){
            System.out.println("parent");
        }

        System.out.println("Hi");
    }
}
