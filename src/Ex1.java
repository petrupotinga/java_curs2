public class Ex1 extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
        public static void main (String[]args){
            Ex1 thread1 = new Ex1();
            thread1.start();

            for (int i = 100; i > 0; i--) {
                System.out.println(i);
            }
        }
    }



//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}

