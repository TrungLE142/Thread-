package Act1;

public class Main {
    public static void main(String args[]) {
//
        for (int i = 0; i < 50; i++) {
            Thread t = new MyThread(i);

            t.start();
        }
    }
}

