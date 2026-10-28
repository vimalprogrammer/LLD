package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> arrayToSort,
                  ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1) return arrayToSort;

        int mid = arrayToSort.size()/2;
        List<Integer> left = arrayToSort.subList(0,mid);
        List<Integer> right = arrayToSort.subList(mid,arrayToSort.size());

        Sorter leftSorter = new Sorter(left,executorService);
        Sorter rightSorter = new Sorter(right,executorService);
        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        List<Integer> sortedLeft = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();

        return merge(sortedLeft,sortedRight);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i=0, j=0;
        while(i < left.size() && j < right.size()) {
            if(left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while(i < left.size()) merged.add(left.get(i++));
        while(j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}
