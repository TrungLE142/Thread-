package Act2;

import static java.lang.Thread.*;

public class MyThread extends Thread {
    String name;
    int sleep;
    public MyThread (String name, int sleep){
        this.name = name;
        this.sleep = sleep;
    }

    public void run (){

        try {
            sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " wait time:" + this.sleep);
    }
}
