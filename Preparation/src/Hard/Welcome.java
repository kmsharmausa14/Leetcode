package Hard;

import java.util.*;

public class Welcome {

	public static void main(String args[]){
        int input[][] = {{1,0,1,0,0},
                         {1,0,1,1,1},
                         {1,1,1,1,1},
                         {1,0,0,1,0}};
        int[] d = new int[] {1,3,-1,-3,5,3,6,7};
        //MaximumRectangularSubmatrixOf1s mrs = new MaximumRectangularSubmatrixOf1s();
        double[] maxRectangle = medianSlidingWindow(d,3);
        //System.out.println("Max rectangle is of size " + maxRectangle);
        //assert maxRectangle == 8;
    }

	public static double[] medianSlidingWindow(int[] nums, int k) {
	    double[] result = new double[nums.length - k + 1];
	    TreeSet<Integer> left = getSet(nums);
	    TreeSet<Integer> right = getSet(nums);
	    for(int i = 0; i < nums.length; i++) {
	        if(left.size() <= right.size()) {
	            right.add(i);
	            int m = right.first();
	            right.remove(m);
	            left.add(m);
	        } else {
	            left.add(i);
	            int m = left.last();
	            left.remove(m);
	            right.add(m);
	        }
	        
	        
	        if(left.size() + right.size() == k) {
	            double med;
	            if(left.size() == right.size())
	                med = ((double)nums[left.last()] + nums[right.first()]) / 2;
	            else if(left.size() < right.size())
	                med = nums[right.first()];
	            else
	                med = nums[left.last()];
	                
	            int start = i - k + 1;    
	            result[start] = med;    
	            
	            if(!left.remove(start))
	                right.remove(start);
	        }
	    }
	    return result;
	}

	private static TreeSet<Integer> getSet(int[] nums) {
	    return new TreeSet<>(new Comparator<Integer>(){
	        public int compare(Integer a, Integer b) {
	            return nums[a] == nums[b] ? a - b : nums[a] < nums[b] ? -1 : 1;
	        }
	    });
	}
}
