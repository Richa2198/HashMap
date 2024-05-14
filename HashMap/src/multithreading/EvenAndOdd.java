package multithreading;

// using java 7
//lets check till 1 to 10 even and odd numebr
public class EvenAndOdd implements Runnable {
    static int count = 1;
 //   Object object;

//    public EvenAndOdd(Object object) {
//        this.object = object;
//    }
//
    @Override
    public void run() {
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
//                synchronized (object) {
                    System.out.println("Thread name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
//                    try {
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
            }
            else if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
//                    synchronized (object) {
                        System.out.println("Thread name: " + Thread.currentThread().getName() + " value: " + count);
                        count++;
//                        object.notify();
//                    }

                }
            }
        }

    public static void main(String[] args) {
//        Object lock = new Object();
        Runnable r1 = new EvenAndOdd();
        Runnable r2 = new EvenAndOdd();
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }
}
