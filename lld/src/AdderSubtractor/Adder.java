package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

	Value value;

	Adder(Value value)
	{
		this.value = value;
	}

	@Override
	public Void call() throws Exception {
		for(int i=1;i<100;i++)
		{
			this.value.x +=i;
		}
		return null;
	}
}
