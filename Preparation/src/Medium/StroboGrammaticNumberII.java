package Medium;import java.util.*;

public class StroboGrammaticNumberII {

	public static void main(String[] args) {
		findStrobogrammatic(4);
	}
	
	public static List<String> findStrobogrammatic(int n)
	{
		List<String> result = new ArrayList<>();
		if(n%2==0)
			result.add("");
		else
		{
			result.add("1");
			result.add("8");
			result.add("0");
		}
		while(n>=2)
		{
			List<String> temp=result;
			result = new ArrayList<String>();
			for(String str:temp)
			{
				if(n>3)
					result.add("0"+str+"0");
				result.add("1" + str + "1");
				result.add("8" + str + "8");
				result.add("6" + str + "9");
				result.add("9" + str + "6");
			}
			n-=2;
		}
		return result;
	}

}
