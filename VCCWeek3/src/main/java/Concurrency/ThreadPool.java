package Concurrency;
    public class ThreadPool implements Runnable {

        private int numApple;

        public ThreadPool(int numApple){
            this.numApple=numApple;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" an qua tao  " + numApple);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" End.");
        }
        @Override
        public String toString() {
            return "ThreadPool{" +
                    "numApple=" + numApple +
                    '}';
        }
    }