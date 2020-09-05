package Easy;
//243
public class ShortestWordDistance {

	public static void main(String[] args) {
		String[] ar = new String[] {"makes","coding"};
		int a = shortestworddistance(ar,"makes","coding");
	}
	
	public static int shortestworddistance(String[] words,String word1,String word2)
	{
		int i1=-1,i2=-1;
		int minDistance = words.length;
		int currentDistance;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(word1))
				i1=i;
			else if(words[i].equals(word2))
				i2=i;
			if(i1!=-1 && i2!=-1)
				minDistance=Math.min(minDistance, Math.abs(i1-i2));
		}
		return minDistance;
	}

}
