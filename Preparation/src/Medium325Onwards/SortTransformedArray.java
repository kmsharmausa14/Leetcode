package Medium325Onwards;
//Leave this question
public class SortTransformedArray {

	public static void main(String[] args) {
		
	}

	public int[] sortTransformedArray(int[] nums,int a,int b,int c)
	{
		if(nums.length==0)
			return nums;
		int len=nums.length;
		int[] rst = new int[len];
		int pos1=0,pos2=len-1;
		int start=0,end=len-1;
		
		while(start<=end)
		{
			int first = calculate(nums[start],a,b,c);
			int second = calculate(nums[end],a,b,c);
			if (a >= 0) {
                if (first > second) {
                    rst[pos2--] = first;
                    start++;
                } else {
                    rst[pos2--] = second;
                    end--;
                }
            } else {
                if (first < second) {
                    rst[pos1++] = first;
                    start++;
                } else {
                    rst[pos1++] = second;
                    end--;
                }
            }
		}
		return rst;
	}
	
	public int calculate(int x,int a,int b,int c)
	{
		return a*x*x+b*x+c;
	}
}
