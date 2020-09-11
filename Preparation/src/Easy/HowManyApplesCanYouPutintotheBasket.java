package Easy;
//1196
import java.io.*;
import java.util.*;
public class HowManyApplesCanYouPutintotheBasket {

	public static void main(String[] args) {
		int[] arr = new int[]{100,200,150,1000};
	    Arrays.sort(arr);
	    int sum = 0;
	    for(int i = 0;i<arr.length;i++)
	    {
	      sum+=arr[i];
	      if(sum>5000)
	      {
	        System.out.println(i);
	        return;//return i;
	      }
	    }

	}

}
