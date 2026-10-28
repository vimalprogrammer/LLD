package AddSubSyncMethod;

import java.util.concurrent.Callable;

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
			this.value.syncIncValue(i);
		}
		return null;
	}
}
