package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	static void main() throws ExecutionException, InterruptedException {
		Value value = new Value(0);

		Adder adder = new Adder(value);
		Subtractor subtractor = new Subtractor(value);

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Future<Void> addFut = executorService.submit(adder);
		Future<Void> subFut = executorService.submit(subtractor);

		addFut.get();
		subFut.get();

		System.out.println(value.x);

		executorService.shutdown();

	}
}
