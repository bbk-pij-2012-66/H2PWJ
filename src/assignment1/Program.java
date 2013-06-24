package assignment1;


import java.util.Map;
import java.util.TreeMap;

public class Program
{

	/**
	 * @param args
	 */ //test
	public static void main(String[] args)
	{

		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(4,"Mars");
		map.put(2,"Venus");
		map.put(3,"Earth");
		map.put(1,"Mercury");
		for (int n : map.keySet()) {
			System.out.println(map.get(n));
		}
	}

}
