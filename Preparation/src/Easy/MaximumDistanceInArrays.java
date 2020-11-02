package Easy;
//624
public class MaximumDistanceInArrays {

	public static void main(String[] args) {
		MaximumDistanceInArrays m = new MaximumDistanceInArrays();
		int[][] list = new int[][] {{1, 5, 10, 20, 40, 80},{6, 7, 20, 80, 100},{3, 4, 15, 20, 30, 70, 80, 120}};
		int y = m.maxDistance(list);
	}
	
	public int maxDistance(int[][] list)
	{
		
		int res=0, min_val = list[0][0], max_val = list[0][list[0].length-1];
		for(int i=1;i<list.length;i++)
		{
			res = Math.max(res, Math.max(Math.abs(list[i][list[i].length - 1] - min_val), Math.abs(max_val - list[i][0])));
			min_val=Math.min(min_val, list[i][0]);
			max_val=Math.min(max_val, list[i][list[i].length-1]);
		}
		return res;
	}
}
