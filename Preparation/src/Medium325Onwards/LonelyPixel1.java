package Medium325Onwards;

public class LonelyPixel1 {

	public static void main(String[] args) {
		
	}

	public int findLonelyPixel(char[][] picture)
	{
		int n=picture.length;
		int m= picture[0].length;
		int[] rowCount = new int[n];
		int[] colCount = new int[m];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(picture[i][j]=='B')
					{
						rowCount[i]++;
						colCount[j]++;
					}
		
		int count=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(picture[i][j]=='B' && rowCount[i]==1 && colCount[j]==1)
					count++;
		return count;
	}
}
