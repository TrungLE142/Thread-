package Act3;

import javax.swing.*;

public class CalculYear extends Thread {
    My_year year;
    public CalculYear (My_year year){
        this.year = year;
    }
    public void run () {
        for (int i = 0; i < 10;i++){
            synchronized (year) {
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
            int Calcul = year.getYear();
            if (Calcul % 4 == 0) {
                System.out.println("Năm nhuận: " + Calcul);
            } else {
                System.out.println(Calcul + " không phải năm nhuận");
            }

        }
    }
}
