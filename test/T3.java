package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T3 {
	
	public static <K,V> HashMap<K,V> newInstance(){
		return new HashMap<K,V>();	
	}
	
	public static void main(String[] args){
		Map<String,List<String>> m = T3.newInstance();
	}
}
