package buffer;

public class Consumer implements Runnable{
	private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {  
            try {
                buffer.consume();
                Thread.sleep(150);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}