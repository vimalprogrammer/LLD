package ConcurrencyProblems.Addition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Addition implements Callable<Long> {

	private List<Integer> arr = new ArrayList<>();
	private int start;
	private int end;

	Addition(List<Integer> arr, int start, int end)
	{
		this.arr = arr;
		this.start = start;
		this.end = end;
	}

	@Override
	public Long call() throws Exception {
		long sum = 0L;
		for(int i=start;i<end;i++)
		{
			sum+= arr.get(i);
		}
		return sum;
	}
}
