package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapExample {

	public static void main(String [] args) {
		//Map객체 선언<key,value>한쌍
		//key를 String, value를 int로 할 때
		Map<String, Integer> map=		//<key, value> 한쌍.
				new HashMap<String, Integer>();
		//Key를 String,value를 String로 할 때
		Map<String, String> map1=
				new HashMap<String,String>();
		//Key를 int, value를 String로 할 때
		Map<Integer,String> map2=
				new HashMap<Integer,String>();
		
		//map 객체에 데이터 저장하기
		map.put("응가",1);
		map.put("마려", 3);
		map.put("방", 9);
		
		map1.put("응가","마려");
		
		//map 객체 크기 출력하기.
		System.out.println("map의 크기 : "+map.size());
		
		//map에 저장된 데이터 가져오기.
		System.out.println(map.get("응가"));	//응가라고 쓴것이 key값이므로 key를 대입하면 key에 대한 value값이 출력된다.
		System.out.println(map.get("방"));
		
		//map 객체에 담긴 전체 데이터 출력하기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}
}
