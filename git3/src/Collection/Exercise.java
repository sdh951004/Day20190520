package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {

	

	public static void main(String[] args) {
		/*
		 * List�� ���ڿ� �̸� 5���� �Է� �޾Ƽ� 
		 * ���� �� �̸��� ����ϼ���.
		 */
		
		List<String> list = new ArrayList<String>();	//List����
		Scanner scan= new Scanner(System.in);//��ĵ ����
//		for(int i=0;i<5;i++) {//for������ ���ڰ��� �����Ͽ� size�� �����Ѵ�.
//			System.out.println(i+1 +"��° ���ڿ� �Է��ϼ���. ");
//		list.add(scan.next());
//		}
//		String max="";	//���ڿ� ũ�� ���ϱ� ���� max�� �ִ밪�� ����.
//		for(int i=0; i<list.size();i++) {	
//			String name=list.get(i);
//			
//	
//			if(max.length()<name.length()) {
//			max=list.get(i);
//		}
//		}
//		System.out.println("���� �� ���ڿ� �̸�:"+max);
		
		
		//������ ����
		//5�� �ܾ� �Է��ϱ�
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"��° �ܾ� �Է� �ϼ���.");
			String word = scan.next();
			list.add(word);
		}
		
		//�Էµ� ���� Ȯ��
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//���� �� �ܾ� ã��
		int longWord=0;
		for(int i=1;i<list.size();i++) {
			if(list.get(longWord).length()<list.get(i).length()) {
				longWord = i;
			}
		}
		System.out.println("���� �� �ܾ�� : "+list.get(longWord));
	
		

		
		
		
	
		
		
		

	}

}
