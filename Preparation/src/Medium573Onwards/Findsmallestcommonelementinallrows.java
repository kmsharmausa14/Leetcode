package Medium573Onwards;

public class Findsmallestcommonelementinallrows {

	int findAtLeast(int a, int[] data) {
        int low = 0;
        int high = data.length - 1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(data[mid]==a) return a;
            else if(data[mid] > a) high = mid;
            else low = mid + 1;
        }
        return data[low];
    }
   
    public int smallestCommonElement(int[][] mat) {
        int max = Integer.MIN_VALUE;
        while(true) {
            int total = 0;
            for(int i = 0; i < mat.length; i++) {
                int result = findAtLeast(max, mat[i]);
                if(result > max) {
                    total = 0;
                    max = result;
                } else if(result == max) {
                    total++;
                } else {
                    return -1;
                }
            }
            if(total == mat.length) {
                return max;
            }
        }
    }
}
