package Act1;

public class MyThread extends Thread {
    int num;
    public MyThread (int num){
        this.num= num;

    }
    public void run() {

        System.out.println("Thread No: " + this.num);
        }
    }

