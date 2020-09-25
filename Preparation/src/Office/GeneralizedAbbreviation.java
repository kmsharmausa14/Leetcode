package Office;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {

	public static void main(String[] args) {
		
	}

	public static List<String> generateAbbreviations(String word)
	{
		List<String> ret = new ArrayList<String>();
		if(word==null)
			return ret;
		
		helper(word,0,"",0,ret);
		return ret;
	}
	
	public static void helper(String word,int position,String curr,int counter, List<String> ret)
	{
		if(position==word.length())
			ret.add(word);
		else
		{
			helper(word,position+1,curr+word.charAt(position),)
		}
	}
}
