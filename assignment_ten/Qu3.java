package assignment_ten;

public class Qu3 extends Thread {
    Qu3(String naam) {
        super(naam);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this + " [Timed: " + (i + 1) + "]");
        }
    }

    public static void main(String[] args) {
        Qu3 qs[] = new Qu3[3];
        for (int i = 1; i < 4; i++) {
            qs[i - 1] = new Qu3("Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}

