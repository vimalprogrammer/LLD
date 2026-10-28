package ConcurrencyProblems.Addition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Client {
	static void main() throws ExecutionException, InterruptedException {

		List<Integer> arr = new ArrayList<>();

		for(int i=1;i<=1000000;i++)
		{
			arr.add(i);
		}

		long sum=0;
		for(int i:arr)
		{
//			System.out.println("A["+i+"] :"+ i);
			sum+=i;
		}
		System.out.println("main thread Sum is : "+ sum);

		int cores = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(cores);

//		int cores = Runtime.getRuntime().availableProcessors();
//		Random random = new Random();

		int size = arr.size();
//		int x = arr.size()/cores;
		int chunkSize = arr.size()/cores;
		long firstHalfSum = 0;
		long secondHalfSum = 0;
		long thiredHalfSum = 0;
		long concurrentSum = 0;


//My logic
//		for(int i=0;i<cores;i++)
//		{
////			int start = i * x;
////			int end = (i == cores -1)? arr.size():(i+1) * x;
//
//			Addition additionChunk1 = new Addition(arr, 0, x);
//			Addition additionChunk2 = new Addition(arr, x, 2*x);
//			Addition additionChunk3 = new Addition(arr, 2*x, size);
//
//			Future<Long> futureChunk2 = executorService.submit(additionChunk2);
//			Future<Long> futureChunk3 = executorService.submit(additionChunk3);
//			Future<Long> futureChunk1 = executorService.submit(additionChunk1);
//
//			firstHalfSum = futureChunk1.get();
//			secondHalfSum = futureChunk2.get();
//			thiredHalfSum = futureChunk3.get();
//
//			concurrentSum = firstHalfSum+secondHalfSum+thiredHalfSum;
//		}

		Future<Long>[] future = new Future[cores];

		for(int i=0;i<cores;i++)
		{
			int start = i * chunkSize;
			int end = (i == cores-1)? arr.size():(i+1) * chunkSize;

			Addition addition = new Addition(arr, start, end);
			future[i] = executorService.submit(addition);
		}

		long totalSum = 0L;
		for(int i=0;i<cores;i++)
		{
			totalSum += future[i].get();
		}

//		System.out.println("Concurrency Sum Value : " + concurrentSum);
		System.out.println("Concurrency Sum Value : " + totalSum);
		executorService.shutdown();
	}

}
