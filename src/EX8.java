public class EX8 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("method main begins");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500);
        System.out.println("method main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work ends");
    }
}
