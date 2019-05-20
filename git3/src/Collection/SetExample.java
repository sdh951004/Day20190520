package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	//Set선언
	Set<String> set=new HashSet<String>();
	//set 객체에 데이터 담기
	set.add("응가 보존의 법칙");
	set.add("응가는 하루에 한번");
	set.add("응가는 쾌속으로...");
	//set 객체의 크기값 출력하기
	System.out.println("set 크기 : "+set.size());
	
	//set 객체 데이터 삭제
		set.remove("응가는 쾌속으로...");
	
	
	//set 객체에 저장된 데이터 출력하기
	Iterator<String> iterator=set.iterator(); //반복자.. set에 들어있는 데이터를 하나씩 끄집어 내는 역할.
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}
}
