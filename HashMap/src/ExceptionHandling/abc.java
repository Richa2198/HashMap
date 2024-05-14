package ExceptionHandling;

import java.io.IOException;

public class abc {
    void m() throws IOException {
        throw new IOException("device");
    }
    void n() throws IOException {
        m();
    }
    void p() throws IOException {
        n();
    }

    public static void main(String[] args) throws IOException {
        abc obj = new abc();
        try {
            obj.p();
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("main");
    }
}
