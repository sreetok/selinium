package programme;

import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		map.put(1, 100);
		map.put(4, 100);
		map.put(30,100);
		map.put(4, 200);
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		System.out.println(map.get(20));
		System.out.println(map.get(30));
		
		
		
	}

}
