package многопоточность;

public class Ex2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex2());
        thread1.start();
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}
//        Thread thread1 = new Thread(new MyThread3());
//        Thread thread2 = new Thread(new MyThread4());
//        thread1.start();
//        thread2.start();
//    }
//}
//
//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    public void run() {
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}
