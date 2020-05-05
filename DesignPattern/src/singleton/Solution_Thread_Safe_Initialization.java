package singleton;

public class Solution_Thread_Safe_Initialization {
	
	public static class Printer4 {
		// �ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ�
		private static Printer4 printer = null;
		private int counter = 0;
		private Printer4() {}
		
		// �ν��Ͻ��� ����� �޼��� ����ȭ ( �Ӱ� ���� ���� )
		public synchronized static Printer4 getPrinter() {
			if ( printer == null) {
				printer = new Printer4();
			}
			
			return printer;
		}
		
		public void print(String str) {
			// ���� �ϳ��� �����常 ������ ����� ( �Ӱ� ���� )
			// ������ ���� �ʿ��� �κи��� �Ӱ� �������� �����Ѵ�.
			
			synchronized(this) {
				counter++;
				System.out.println(str + counter);
			}
		}
	}
	
	
	// 1) �ν��Ͻ��� ����� �޼��带 �Ӱ� �������� ����
	//	���� ������ ȯ�濡�� ���ÿ� ���� �����尡 getPrinter �޼��带 �����ϴ� ��ü�� ���� �ϴ� ���� �����Ѵ�.
	// 2) ���� ������ �����ϴ� �κ��� �Ӱ� �������� ����
	//	���� ���� �����尡 �ϳ����� counter ���� ���� ���ÿ� ������ �����ϴ� ���� �����Ѵ�.
	// getInstance() �� Lock�� �ϴ� ����̶� �ӵ��� ������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
