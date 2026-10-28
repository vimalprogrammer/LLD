package AddSubSyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

		System.out.println(value.getX());

		executorService.shutdown();

	}
}

/* without synchronized method
Possible execution without synchronization
Thread	Action	Result
Adder	Reads x	10
Subtractor	Reads x	10
Adder	Calculates 10 + 5 and writes	15
Subtractor	Calculates 10 - 3 and writes	7
Final value: 7 (instead of 12)
Why? The Subtractor read the old value 10 before the Adder updated it. Its write overwrote the Adder's update. This is called a race condition, specifically a lost update.

Why does synchronized fix this?
With synchronized, the execution becomes:
1. Adder locks the Value object.
2. Adder updates 10 → 15.
3. Adder releases the lock.
4. Subtractor acquires the lock.
5. Subtractor updates 15 → 12.
 */
