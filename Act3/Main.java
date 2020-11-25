package Act3;

public class Main {
    public static void main(String[] args) {
        My_year year = new My_year();

        Thread RandomYear = new MyThread3(year);
        Thread Calcul = new CalculYear(year);

        RandomYear.start();
        Calcul.start();
    }
}

