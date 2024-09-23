package mthread;

public class DivisibleThread extends Thread {
	

@Override
public void run() {
    while (!DivisibleNum.isFinished()) {
        synchronized (DivisibleNum.class) {
            if (!DivisibleNum.isFinished()) {
             
                DivisibleNum.printTwo();
                DivisibleNum.printThree();
                DivisibleNum.printFour();
                DivisibleNum.printFive();
                DivisibleNum.printNumber();

                DivisibleNum.currentNumber++;

       
                DivisibleNum.class.notifyAll();
                try {
        
                    DivisibleNum.class.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                DivisibleNum.class.notifyAll();  
            }
        }
    }
}
}