package Medium325Onwards;
//418
public class SentenceScreenFitting {

	public static void main(String[] args) {
		
	}

	public int wordsTyping(String[] sentence,int rows,int cols)
	{
		int i=0;
		int cnt=0;
		int k=0;
		int colLen = cols;
		
		while(i<rows)
		{
			String sen = sentence[k++];
			if(sen.length()>cols)
				return 0;
			if(colLen>=sen.length())
				colLen=colLen-sen.length()-1;
			else
			{
				i++;
				colLen=cols;
				colLen=colLen-sen.length()-1;
			}
			if(i>=rows)
				return cnt;
			if(k==sentence.length)
			{
				cnt++;
				k=0;
			}
		}
		return cnt;
	}
}
