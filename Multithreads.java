/*
Q19. Write a program "Multithreads" that creates two threads, one thread with name "CSThread" and the other thread named "1Thread". Each thread should display its respective name and execute after a gap of 500 milliseconds. Each thread should also display a number indicating the number of times it got a chance to execute.
 */
class NewThread implements Runnable {
    Thread t;
    String name;
    NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Created Child Thread: " + name);
    }
    public void start() {
        t.start();
    }
    public void run() {
        try {
            for(int i=5; i>=0; i--) {
                System.out.println("Thread: " + name + " - " + i);
                Thread.sleep(500);
            }         
        }
        catch(InterruptedException e) {
            System.out.println(name + " Thread interrupted.");
        }
        System.out.println("Exiting " + name + " Thread.");
    }
}
public class Multithreads {
    public static void main(String args[]) {
        NewThread t1 = new NewThread("CSThread");
        NewThread t2 = new NewThread("1Thread");

        t1.start();
        t2.start();
    }
}
/*
OUTPUT:
Created Child Thread: CSThread
Created Child Thread: 1Thread
Thread: CSThread - 5
Thread: 1Thread - 5
Thread: CSThread - 4
Thread: 1Thread - 4
Thread: CSThread - 3
Thread: 1Thread - 3
Thread: CSThread - 2
Thread: 1Thread - 2
Thread: CSThread - 1
Thread: 1Thread - 1
Thread: CSThread - 0
Thread: 1Thread - 0
Exiting CSThread Thread.
Exiting 1Thread Thread.
 */