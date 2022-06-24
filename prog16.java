//16.program to demonstrate creation of thread
class mythread implements Runnable {
    String thrdname;

    mythread(String str) {
        thrdname = str;
    }

    public void run() {
        System.out.println("running thread " + thrdname);
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("running thread " + thrdname + " time " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("unable to halt thread" + exc);
        }
    }
}

public class prog16 {
public static void main(String [] args)
{mythread mt=new mythread("thrd1");
Thread newthrd=new Thread(mt);
    mythread mt2=new mythread("thrd2");
    Thread newthrd2=new Thread(mt2);
newthrd.start();
newthrd2.start();}
    }
