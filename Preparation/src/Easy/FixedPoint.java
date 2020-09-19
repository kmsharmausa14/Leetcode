package Easy;
//1064
public class FixedPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int fixedPoint(int[] A) {
        //Run binary search
        int lo = 0;
        int hi = A.length - 1;
        
        while (lo <= hi){
            int mi = lo + (hi - lo) / 2;
            if (A[mi] == mi) return mi;
            if (mi < A[mi]) hi = mi - 1;
            else lo = mi+1;
        }
        return -1;
	}
}
