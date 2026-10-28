package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

	Value value;
	Lock lock;

	Subtractor(Value value, Lock lock)
	{
		this.value = value;
		this.lock = lock;
	}

	@Override
	public Void call() throws Exception {
//		lock.lock();
		for(int i=1;i<100;i++)
		{
			lock.lock();
			this.value.x -=i;
			System.out.println("Subtracting : "+ i);
			lock.unlock();
		}
//		lock.unlock();
		return null;
	}
}
