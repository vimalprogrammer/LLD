package Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

	static void main() {

		Store store = new Store(5);

		Semaphore producerSemaphore = new Semaphore(5);
		Semaphore consumerSemaphore = new Semaphore(0);

		ExecutorService executorService = Executors.newCachedThreadPool();

		//8 producers
		for(int i=0;i<8;i++)
		{
			Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
			executorService.execute(producer);
		}

		//20 consumers
		for(int i=0;i<20;i++)
		{
			Consumer consumer = new Consumer(store,producerSemaphore, consumerSemaphore);
			executorService.execute(consumer);
		}
		executorService.shutdown();
	}
}
