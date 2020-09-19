package Easy;
//1243
import java.util.Arrays;

public class ArrayTransformation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f = transformArray(new int[]{1,6,3,4,3,5});
	}
	
	public static int[] transformArray(int[] arr)
	{
		int n=arr.length;
		int[] pre = Arrays.copyOf(arr, n);
		boolean flag = true;
        while (flag) {
            for (int i = 1; i < n - 1; i++) {
                if (pre[i - 1] < pre[i] && pre[i] > pre[i + 1])
                    arr[i]--;
                if (pre[i - 1] > pre[i] && pre[i] < pre[i + 1])
                    arr[i]++;
            }
            flag = false;
            for (int i = 0; i < n; i++)
                if (pre[i] != arr[i]) {
                    pre[i] = arr[i];
                    flag = true;
                }
        }
        return arr;
	}
	
}
