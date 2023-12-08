public class Ex4 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        System.out.println("Name of myThread4 = " + myThread4.getName() +
                "Priority of myThread4 = " + myThread4.getPriority());
        MyThread4 myThread5 = new MyThread4();
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                "Priority of myThread5 = " + myThread5.getPriority());
    }
}
class MyThread4 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}