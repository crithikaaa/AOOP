package mthread;

public class Main {
	public static void main(String[] args)
	{
		Thread t1 = new DivisibleThread();
        Thread t2 = new DivisibleThread();
        Thread t3 = new DivisibleThread();
        Thread t4 = new DivisibleThread();
        Thread t5 = new DivisibleThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

	}

