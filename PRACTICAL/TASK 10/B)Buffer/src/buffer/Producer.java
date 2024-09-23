package buffer;

public class Producer implements Runnable {
	private BoundedBuffer buffer;
	 public Producer(BoundedBuffer buffer) {
	        this.buffer=buffer;
	    }
	 @Override
	    public void run() {
	        for (int i = 1; i <= 20; i++) {  
	            try {
	                buffer.produce(i);
	                Thread.sleep(100);  
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
}
