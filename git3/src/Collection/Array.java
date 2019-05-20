package Collection;

import java.util.*;

import java.util.List;

public class Array {
	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1.List
		 * -������ �����ϰ� ������ �� ����.
		 * -�ߺ� ������ ������.
		 * 2.Set
		 * -�����ϴµ� ������ ����.
		 * -�ߺ� ������ �Ұ���
		 * 3.Map
		 * -key, value�� ������ �����.
		 * -key ���� �ߺ� �Ұ���.
		 */
		//ArrayList����
		List<String> list = new ArrayList<String>(); //Ŭ���� �̸��� �����ϸ� �ȵȴ�.
//////////////////////////////////////////////		
//		/*<������Ÿ��>: ���׸�(Generic)
//		 * -���ŷο� Ÿ�� ��ȯ�� ������ ��.
//		 * ���׸��� ������� �ʰ� list ��ü�� �����ؼ� ���
//		 */ 
//		List list1 = new ArrayList();
//		list.add("���� ������ ��Ģ");	
//		Object obj=list.get(0);		
//		String value = (String)obj;
//		System.out.println(value);
//////////////////////////////////////////////
		//list ��ü�� ������ ����
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("�߰�");
		//�ε����� ������ �߰��ϱ�
		list.add(2, "Įġ��");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		//list�� ũ�� ���
		System.out.println("list �� ũ�� :" + list.size()); //list�� ũ�� size
		
		//list�� ��� ������ ���
		System.out.println("ù��° ������\t"+list.get(0));
		System.out.println("ù��° ������\t"+list.get(1));
		System.out.println("ù��° ������\t"+list.get(2));
		System.out.println("ù��° ������\t"+list.get(3));
		System.out.println(list.get(4));
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+"��° ������ :"+ list.get(i));
		}
		System.out.println("---------------------------------------");
		//������ ����
		list.remove(2);
		list.remove(2);
		list.remove(2);
		list.remove("����");
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1+"��° ������ :"+ list.get(i));
		}
		
	
	}
}
