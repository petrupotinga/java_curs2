public class Ex11 {
    static final Car car = new Car();

    void mobileCall() {
        synchronized (car) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (car) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call ends");

        }
    }

    void whatsappCall() {
        synchronized (car) {
            System.out.println("whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex11().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex11().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new Ex11().whatsappCall();
    }
}

class Car {
}