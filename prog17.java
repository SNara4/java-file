//17.program to demonstrate thread priority and some thread class function

//creating thread via Runnable
class mythd implements Runnable
{String name;
    Thread thr;

    mythd(String str)
    {name=str;
        thr=new Thread(this,name);}

    public static mythd createandrun(String str)
    {mythd m1=new mythd(str);
        m1.thr.start();
        return m1;
    }

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("running thread " + thr.getName() + " time " + i);
                System.out.println("running " + thr.getName() + " with priority " + thr.getPriority());
            }
        } catch (InterruptedException exc) {
            System.out.println("unable to halt thread" + exc);
        }
    }
}

//creating thread via Thread
class myth extends Thread
{   myth(String str)
    {super(str);}

    public void run()
    {try {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            this.setPriority(i+1);
            System.out.println("running "+this.getName()+" with priority "+this.getPriority()+"  via Thread class");
            System.out.println("running thread " + this.getName() + " time " + i);
        }
    } catch (InterruptedException exc)
        {System.out.println("unable to halt thread" + exc);}

    }

}
public class prog17 {
    public static void main(String[] args) throws InterruptedException {
        mythd mt = mythd.createandrun("child1");
        myth mt2 = new myth("child2");
        System.out.println("child 1 status "+mt.thr.isAlive());
        mt2.start();
        mt2.join();
        System.out.println("mt2 is dead");
        System.out.println("child 1 status "+mt.thr.isAlive());
    }
}
