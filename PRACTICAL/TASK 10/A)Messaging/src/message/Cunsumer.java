package message;

public class Cunsumer implements Runnable{
	private SharedBuffer buffer;

    public Cunsumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(150);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
