//18.program to demonstrate synchronized method

class pattern {
    synchronized static void display(int i)
    { System.out.println(Thread.currentThread().getName());
        for(int j=0;j<5;j++){
            System.out.print(i*j+" ");
            try {Thread.sleep(500);
            } catch (InterruptedException e) {System.out.println(e);}
        }
    }
}

class mt implements Runnable
{Thread t;
    int i;
    mt(String str,int i)
    {this.i=i;
        t=new Thread(this,str);}

    public static mt candr  (String str,int i)
    {mt c1=new mt(str,i);
        c1.t.start();
        return c1;
    }

    public void run()
    {System.out.println("starting "+Thread.currentThread().getName());
        pattern.display(i);
        System.out.println(t.getName() + " terminating.");
    }

}

public class prog18 {
    public static void main(String[] args)
    {mt t1=mt.candr("child1",1);
        mt t2=mt.candr("child2",3);
    }

}
