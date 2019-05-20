package Collection;

import java.util.*;

import java.util.List;

public class Array {
	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1.List
		 * -순서를 유지하고 저장할 수 있음.
		 * -중복 저장이 가능함.
		 * 2.Set
		 * -저장하는데 순서가 없음.
		 * -중복 저장이 불가능
		 * 3.Map
		 * -key, value의 쌍으로 저장됨.
		 * -key 값은 중복 불가능.
		 */
		//ArrayList선언
		List<String> list = new ArrayList<String>(); //클래스 이름과 동일하면 안된다.
//////////////////////////////////////////////		
//		/*<데이터타입>: 제네릭(Generic)
//		 * -번거로운 타입 변환을 제거해 줌.
//		 * 제네릭을 사용하지 않고 list 객체를 선언해서 사용
//		 */ 
//		List list1 = new ArrayList();
//		list.add("응가 보존의 법칙");	
//		Object obj=list.get(0);		
//		String value = (String)obj;
//		System.out.println(value);
//////////////////////////////////////////////
		//list 객체에 데이터 저장
		list.add("응가");
		list.add("마려");
		list.add("변비");
		list.add("추가");
		//인덱스로 데이터 추가하기
		list.add(2, "칼치기");
		list.add("응가");
		list.add("응가");
		list.add("응가");
		list.add("응가");
		list.add("응가");
		list.add("응가");
		
		//list의 크기 출력
		System.out.println("list 의 크기 :" + list.size()); //list의 크기 size
		
		//list에 담긴 데이터 출력
		System.out.println("첫번째 데이터\t"+list.get(0));
		System.out.println("첫번째 데이터\t"+list.get(1));
		System.out.println("첫번째 데이터\t"+list.get(2));
		System.out.println("첫번째 데이터\t"+list.get(3));
		System.out.println(list.get(4));
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+"번째 데이터 :"+ list.get(i));
		}
		System.out.println("---------------------------------------");
		//데이터 삭제
		list.remove(2);
		list.remove(2);
		list.remove(2);
		list.remove("마려");
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+"번째 데이터 :"+ list.get(i));
		}
		
	
	}
}
