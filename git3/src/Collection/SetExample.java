package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	//Set����
	Set<String> set=new HashSet<String>();
	//set ��ü�� ������ ���
	set.add("���� ������ ��Ģ");
	set.add("������ �Ϸ翡 �ѹ�");
	set.add("������ �������...");
	//set ��ü�� ũ�Ⱚ ����ϱ�
	System.out.println("set ũ�� : "+set.size());
	
	//set ��ü ������ ����
		set.remove("������ �������...");
	
	
	//set ��ü�� ����� ������ ����ϱ�
	Iterator<String> iterator=set.iterator(); //�ݺ���.. set�� ����ִ� �����͸� �ϳ��� ������ ���� ����.
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}
}
