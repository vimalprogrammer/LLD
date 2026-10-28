package ConcurrencyProblems.Scrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	static void main() throws ExecutionException, InterruptedException {
		ExecutorService executorServiceFixed = Executors.newFixedThreadPool(10);
		ExecutorService executorServiceCached = Executors.newCachedThreadPool();

		String url = "https://www.example.com/";

		long fixedThreadStart = System.currentTimeMillis();
		List<Future<Void>> futuresFixed = new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			Scraper scraper = new Scraper(url+i);
			futuresFixed.add(executorServiceFixed.submit(scraper));
		}

		for(Future<Void> future : futuresFixed)
		{
			future.get();
		}

		executorServiceFixed.shutdown();
		long fixedThreadEnd = System.currentTimeMillis();
		System.out.println("Fixed Thread Time: "+ (fixedThreadEnd-fixedThreadStart));


		List<Future<Void>> futuresCached = new ArrayList<>();

		long cacheThreadStart = System.currentTimeMillis();
		for(int i=0;i<100;i++)
		{
			Scraper scraper = new Scraper(url+i);
			futuresCached.add(executorServiceCached.submit(scraper));
		}
		for(Future<Void> future : futuresCached)
		{
			future.get();
		}
		executorServiceCached.shutdown();
		long cacheThreadEnd = System.currentTimeMillis();
		System.out.println("Cached Thread Time: "+ (cacheThreadEnd-cacheThreadStart));

	}

	// Fixed Thread Pool:
	// 100 URLs are processed using 10 threads.
	// Each thread handles multiple tasks, so tasks run in batches.
	// Since each task takes 200 ms, total execution time is approximately 2000 ms.
	// Actual time: 2049 ms.

	// Cached Thread Pool:
	// Creates threads dynamically to execute multiple tasks concurrently.
	// Most or all of the 100 tasks can run at the same time.
	// Since each task takes 200 ms, execution time is approximately 200 ms.
	// Actual time: 214 ms.

	// Conclusion:
	// Cached Thread Pool completed the tasks much faster than the Fixed Thread Pool
	// because it could execute more tasks concurrently.
}
