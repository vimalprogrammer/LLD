package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	static void main() throws ExecutionException, InterruptedException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Multiplier multiplier = new Multiplier(5);

		Future<Integer> future = executorService.submit(multiplier); //callable used to return something, future is something like a token, using that token, we can get the result

		int result = future.get();

		System.out.println(result);

	}

}
