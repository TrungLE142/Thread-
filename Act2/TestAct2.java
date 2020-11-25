package Act2;

public class TestAct2 {
    public static void main (String args[]) {
        Thread t1 = new MyThread("ABC",3500);
        Thread t2 =new MyThread("DEF",2500);
        t1.start();
        t2.start();
    }

}
