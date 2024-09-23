package buffer;

public class Bufferbound {
	 public static void main(String[] args) {
	        BoundedBuffer buffer = new BoundedBuffer();  

	        Producer producer = new Producer(buffer);
	        Consumer consumer = new Consumer(buffer);

	        Thread producerThread = new Thread(producer, "Producer");
	        Thread consumerThread = new Thread(consumer, "Consumer");

	        producerThread.start();
	        consumerThread.start();

	        try {
	            producerThread.join();
	            consumerThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
