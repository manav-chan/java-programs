/*
Q20. Write a Java program to solve producer consumer problem in which a producer produces a value and consumer consumes the value before producer generate the next value.
 */
class Q {
    int n;
    boolean isSet = false;
    synchronized void put(int n) {
        if(isSet == true) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        this.n = n;
        System.out.println("Put: " + n);
        isSet = true;
        notify();
    }
    synchronized int get() {
        if(isSet == false) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Got: " + n);
        isSet = false;
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        notify();
        return n;
    }
}
class Producer implements Runnable {
    Q q;
    Thread t;
    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;
    Thread t;
    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
        t.start();
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}
public class PC {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Ctrl + C to stop.");
    }
}
/*
OUTPUT:
Press Ctrl + C to stop.
Put: 0
Got: 0
Put: 1
Got: 1
Put: 2
Got: 2
Put: 3
Got: 3
Put: 4
Got: 4
 */