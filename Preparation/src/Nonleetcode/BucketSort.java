package Nonleetcode;
import java.util.*;

public class BucketSort {
	
	public static void main(String[] args) {
		List<Integer> unsorted = Arrays.asList(80,50,60,30,20,10,70,0,40,500,600,602,200,15);
		BucketSort ss = new BucketSort();
		List<Integer> sorted = ss.sort(unsorted);
		System.out.println("Welcome Bhai");
	}
	
	private final Comparator<Integer> comparator;

    public BucketSort(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public BucketSort() {
        comparator = Comparator.naturalOrder();
    }

    public List<Integer> sort(List<Integer> arrayToSort) {

        List<List<Integer>> buckets = splitIntoUnsortedBuckets(arrayToSort);

        for(List<Integer> bucket  : buckets){
            bucket.sort(comparator);
        }

        return concatenateSortedBuckets(buckets);
    }

    private List<Integer> concatenateSortedBuckets(List<List<Integer>> buckets){
        List<Integer> sortedArray = new LinkedList<>();
        for(List<Integer> bucket : buckets){
            sortedArray.addAll(bucket);
        }
        return sortedArray;
    }

    private List<List<Integer>> splitIntoUnsortedBuckets(List<Integer> initialList){

        final int max = findMax(initialList);
        final int numberOfBuckets = (int) Math.sqrt(initialList.size());

        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i < numberOfBuckets; i++) buckets.add(new ArrayList<>());

        //distribute the data
        for (int i : initialList) {
            buckets.get(hash(i, max, numberOfBuckets)).add(i);
        }
        return buckets;

    }

    private int findMax(List<Integer> input){
        int m = Integer.MIN_VALUE;
        for (int i : input){
            m = Math.max(i, m);
        }
        return m;
    }

    private static int hash(int i, int max, int numberOfBuckets) {
        return (int) ((double) i / max * (numberOfBuckets - 1));
    }
}
