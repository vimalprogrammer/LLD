package Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	static void main() {
		System.out.println("hello World from Thread: "+ Thread.currentThread().getName());


		HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
		Thread thread = new Thread(helloWorldPrinter);
		thread.start();

//		for(int i=1;i<100000;i++)
//		{
//			Runnable.NumberPrinter numberPrinter = new Runnable.NumberPrinter(i);
//			Thread thread2 = new Thread(numberPrinter);
//			thread2.start();
//		}

		//To limit the thread we use threadpool, threadpool implemented using ExecutorService

		ExecutorService executorService = Executors.newFixedThreadPool(5);//fixed no of threads + working queue

		ExecutorService executorService1 = Executors.newCachedThreadPool();

		for(int i=1;i<1000;i++)
		{
			if(i==505)
			{
				System.out.println("debug");
			}
			NumberPrinter numberPrinter = new NumberPrinter(i);
//			executorService.execute(numberPrinter);
			executorService1.execute(numberPrinter);
		}

		executorService1.shutdown();

	}
}
