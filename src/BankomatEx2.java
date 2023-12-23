import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankomatEx2 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee1("Zaur", lock);
        new Employee1("Oleg", lock);
        new Employee1("Elena", lock);
        Thread.sleep(7000);
        new Employee1("Victor", lock);
        new Employee1("Marina", lock);
    }
}

class Employee1 extends Thread {
    String name;
    private Lock lock;

    public Employee1(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " foloseste bancomatul");
                Thread.sleep(2000);
                System.out.println(name + " a finalizat tranzactia");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " nu vrea sa astepte");
        }
    }
}
