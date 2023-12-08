public class Ex4 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        myThread4.setName("moy potok ");
        myThread4.setPriority(9);
        System.out.println("Name of myThread4 = " + myThread4.getName() +
                "Priority of myThread4 = " + myThread4.getPriority());

    }
}
class MyThread4 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}