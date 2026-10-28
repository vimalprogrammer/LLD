package Runnable;

public class HelloWorldPrinter implements Runnable{

	@Override
	public void run() {
		print();
	}

	public void print()
	{
		System.out.println("Hello World from Thread: "+ Thread.currentThread().getName());
	}
}
