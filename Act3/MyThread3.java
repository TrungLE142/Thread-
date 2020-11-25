package Act3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class MyThread3 extends Thread {
    My_year year;
    public MyThread3 (My_year year){
        this.year = year;
    }
    public void run () {
        Random random = new Random();
        for (int i = 0; i<10; i++){
            synchronized (year) {
                int rd = random.nextInt(8998) + 1001;
                year.setYear(rd);
                System.out.println("Random year: " + rd);
                year.notifyAll();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    year.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}
