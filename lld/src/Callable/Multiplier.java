package Callable;

import java.util.concurrent.Callable;

public class Multiplier implements Callable<Integer> {

	int x;

	Multiplier(int x)
	{
		this.x = x;
	}

	@Override
	public Integer call() throws Exception {
		return 2*x;
	}
}
