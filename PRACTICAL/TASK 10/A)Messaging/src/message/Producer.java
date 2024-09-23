package message;

public class Producer implements Runnable {
	 private SharedBuffer buffer;

	    public Producer(SharedBuffer buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	    	 String[] messages = {
	    	            "Hello!",
	    	            "How are you?",
	    	            "This is AOOP class.",
	    	            "Programming.",
	    	            "bye!"
	    	        };

	    	        for (int i = 0; i < messages.length; i++) {
	    	            try {
	    	                buffer.produce(messages[i]);
	    	                Thread.sleep(100);
	    	            } catch (InterruptedException e) {
	    	                Thread.currentThread().interrupt();
	    	            }
	    	        }
	    	    }
}
