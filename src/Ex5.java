public class Ex5 implements Runnable{
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex5());
        thread.start();
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
}