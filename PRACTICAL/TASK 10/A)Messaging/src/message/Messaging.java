package message;

public class Messaging {
	public static void main(String[] args)
	{
		SharedBuffer buffer= new SharedBuffer(3);
		Producer producer= new Producer(buffer);
		Cunsumer consumer = new Cunsumer(buffer);

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
