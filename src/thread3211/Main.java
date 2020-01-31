package thread3211;

/**
 * Created by sity on 30/01/2020.
 */
public class Main {
        public static void main(String[] args) {
            final String m1 = "aaaa";
            final String m2 = "bbbb";
            Thread t1 = new Thread() {
                public void run() {
                    synchronized (m1) {
                        System.out.println("Thread 1: locked m1");

                        try { Thread.sleep(100);}
                        catch (Exception e) {}

                        synchronized (m2) {
                        }
                    }
                }
            };

            Thread t2 = new Thread() {
                public void run() {
                    synchronized (m2) {
                        System.out.println("Thread 2: locked m2");

                        try { Thread.sleep(100);} catch (Exception e) {}

                        synchronized (m1) {
                        }
                    }
                }
            };


            t1.start();
            t2.start();
        }
    }


