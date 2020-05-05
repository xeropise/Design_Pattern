package singleton;

import javax.annotation.Resource;

public class Printer {
	// Printer Ŭ������ ����� �����͸� �̿��Ϸ���, Client ���α׷����� new Printer()�� �ݵ�� �� ���� ȣ��ǵ��� ���� �ؾ��Ѵ�.
	// �̸� �ؼ��ϱ� ���� �����ڸ� �ܺο��� ȣ���� �� ���� �Ѵ�.
	private Printer() { }	// Printer �����ڸ� �ܺο��� ��� �Ұ�
	
	// �ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ� 
	private static Printer printer = null;
	
	// �ڱ� �ڽ��� �ν��Ͻ��� �ܺο� ����
	public static Printer getPrinter() {
		if (printer == null) {
			// Printer �ν��Ͻ� ����
			printer = new Printer();
		}
		
		return printer;
	}
	public void print(String str) { System.out.println(str); }
	
	// �ڱ� �ڽ� �����Ϳ� ���� �ν��Ͻ��� �ϳ� ����� �ܺο� �������� �޼��尡 �ʿ��ϴ�.
	// static �޼��� / static ����
	//	- ��ü���� �ν��Ͻ��� ���ϴ� ������ �ƴϰ� Ŭ���� ��ü�� ���Ѵ�.
	//	- Ŭ������ �ν��Ͻ��� ������ �ʰ���, �޼��带 ������ �� �ְ� ������ ���� �� �� �ִ�.
	//	���� new Printer()�� ȣ��Ǳ� ���̸�, �ν��Ͻ� �޼����� print() �޼���� ȣ���� �� ����.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
