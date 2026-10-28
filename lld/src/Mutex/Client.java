package Mutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
//The problem of this is, its happening synchronously, thats why we use semaphore
	static void main() {

		Store store = new Store(5);

		ExecutorService executorService = Executors.newCachedThreadPool();

		//8 producers
		for(int i=0;i<8;i++)
		{
			Producer producer = new Producer(store);
			executorService.execute(producer);
		}

		//20 consumers
		for(int i=0;i<20;i++)
		{
			Consumer consumer = new Consumer(store);
			executorService.execute(consumer);
		}

		executorService.shutdown();

	}
}
