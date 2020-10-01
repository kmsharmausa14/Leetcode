package Medium;
//320
import java.util.*;

public class GeneralizedAbbreviation {

	public static void main(String[] args) {
		generateAbbreviations("word");
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
		if(position>=word.length())
		{
			if(counter>0)
				curr+=counter;
			ret.add(curr);
		}
		else
		{
			helper(word,position+1,curr,counter+1,ret);
			helper(word,position+1,curr+(counter>0?counter:"")+word.charAt(position),0,ret);
		}
	}
}
