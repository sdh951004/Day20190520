package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {

	

	public static void main(String[] args) {
		/*
		 * List에 문자열 이름 5개를 입력 받아서 
		 * 가장 긴 이름을 출력하세요.
		 */
		
		List<String> list = new ArrayList<String>();	//List선언
		Scanner scan= new Scanner(System.in);//스캔 선언문
//		for(int i=0;i<5;i++) {//for문으로 문자값을 저장하여 size를 지정한다.
//			System.out.println(i+1 +"번째 문자열 입력하세요. ");
//		list.add(scan.next());
//		}
//		String max="";	//문자열 크기 비교하기 위해 max값 최대값을 선언.
//		for(int i=0; i<list.size();i++) {	
//			String name=list.get(i);
//			
//	
//			if(max.length()<name.length()) {
//			max=list.get(i);
//		}
//		}
//		System.out.println("가장 긴 문자열 이름:"+max);
		
		
		//교수님 버전
		//5개 단어 입력하기
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"번째 단어 입력 하세요.");
			String word = scan.next();
			list.add(word);
		}
		
		//입력된 내용 확인
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//가장 긴 단어 찾기
		int longWord=0;
		for(int i=1;i<list.size();i++) {
			if(list.get(longWord).length()<list.get(i).length()) {
				longWord = i;
			}
		}
		System.out.println("가장 긴 단어는 : "+list.get(longWord));
	
		

		
		
		
	
		
		
		

	}

}
