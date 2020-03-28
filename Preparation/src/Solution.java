import java.util.*;


class Solution {
	
	public static void main(String[] args)
	{
		minCut("aab");
}
	
	public static int minCut(String word){
        int[][] matrix = new int[word.length()][word.length()];

			for (int length = 1; length <= word.length(); length++)
			{
				for (int i = 0; i < word.length() - length; i++)
				{
					int j = i + length - 1;
					if (isPalindrome(word.substring(i, length)))
					{
						matrix[i][j] = 0;
					}
					else
					{
						matrix[i][j] = GetMinimumBetween(matrix, i, j);
					}
				}
			}

			return matrix[0][word.length() - 1];
    }
    
    private static int GetMinimumBetween(int[][] matrix, int i, int j)
		{
			int value = 1 + matrix[i][i] + matrix[i + 1][j];
			int min = value;

			for (int k = i; k <= j - 1; k++)
			{
				value = 1 + matrix[i][k] + matrix[k + 1][j];
				if (min > value)
					min = value;
			}

			return min;
		}
    
    private static boolean isPalindrome(String str) {
	int left = 0;
	int right = str.length() - 1;
 
	while (left < right) {
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
 
		left++;
		right--;
	}
 
	return true;
}
}