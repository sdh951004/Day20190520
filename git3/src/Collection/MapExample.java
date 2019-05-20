package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapExample {

	public static void main(String [] args) {
		//Map��ü ����<key,value>�ѽ�
		//key�� String, value�� int�� �� ��
		Map<String, Integer> map=		//<key, value> �ѽ�.
				new HashMap<String, Integer>();
		//Key�� String,value�� String�� �� ��
		Map<String, String> map1=
				new HashMap<String,String>();
		//Key�� int, value�� String�� �� ��
		Map<Integer,String> map2=
				new HashMap<Integer,String>();
		
		//map ��ü�� ������ �����ϱ�
		map.put("����",1);
		map.put("����", 3);
		map.put("��", 9);
		
		map1.put("����","����");
		
		//map ��ü ũ�� ����ϱ�.
		System.out.println("map�� ũ�� : "+map.size());
		
		//map�� ����� ������ ��������.
		System.out.println(map.get("����"));	//������� ������ key���̹Ƿ� key�� �����ϸ� key�� ���� value���� ��µȴ�.
		System.out.println(map.get("��"));
		
		//map ��ü�� ��� ��ü ������ ����ϱ�
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}
}
