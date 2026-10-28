package AdderSubtractorSyncronize;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

	Value value;

	Adder(Value value)
	{
		this.value = value;
	}

	@Override
	public Void call() throws Exception {
		synchronized (value) {
			for (int i = 1; i < 100; i++) {
				this.value.x += i;
				System.out.println("Adding : "+ i);
			}
			return null;
		}
	}
}
