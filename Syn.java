class CallMe {
    public void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
    Thread t;
    String msg;
    CallMe target;
    Caller(CallMe obj, String s) {
        target = obj;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}
public class Syn {
    public static void main(String args[]) {
        CallMe target = new CallMe();
        try {
            Caller t1 = new Caller(target, "Hello");
            t1.t.join();
            Caller t2 = new Caller(target, "Synchronized");
            t2.t.join();
            Caller t3 = new Caller(target, "World");
            t3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
/*
OUTPUT:
[Hello]
[Synchronized]
[World]
 */