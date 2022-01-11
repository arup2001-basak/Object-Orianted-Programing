package assignment.ten;

public class Qu1 extends Thread {
    Qu1(String naam) {
        super(naam);
        System.out.println("Started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName());
            try {
                this.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Qu1 q1 = new Qu1("Amar Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("BAire theke naam: " + q1.getName());
        q1.start();
        try {
            q1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main exited");
    }
}
