package Concurrency;

public class MyThread implements Runnable {
 //   private int threadNumber;
//    public MyThread(int threadNumber){
//        this.threadNumber = threadNumber;
//    }
    private int numApple = 10;
    @Override
    public void run() {
        try {
            for (int i = 11; i > 0; i--) {
                String name = Thread.currentThread().getName();
                numApple = numApple - 1;
                Thread.sleep(1000);
                if (numApple < 0) {
                    System.out.println("No apple left");
                } else {
//                    System.out.println("Thread " + threadNumber + " eat one apple " );
                    System.out.println(name+ " eat one apple " );                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}
