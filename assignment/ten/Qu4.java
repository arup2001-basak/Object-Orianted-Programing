package assignment.ten;

public class Qu4 implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " [Timed: " + (i + 1) + "]");
        }
    }

    public static void main(String[] args) {
        Thread qs[] = new Thread[3];
        for (int i = 1; i < 4; i++) {
            qs[i - 1] = new Thread(new Qu4(), "Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}

