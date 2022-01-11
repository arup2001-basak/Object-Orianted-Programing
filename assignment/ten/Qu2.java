package assignment.ten;

public class Qu2 implements Runnable {
    Qu2(String naam) {
        System.out.println("Started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Qu2 q2 = new Qu2("Amar Thread");
        Thread t = new Thread(q2, "Custom Naam");
        System.out.println(Thread.currentThread().getName());
        System.out.println("BAire theke naam: " + t.getName());
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main exited");
    }
}

