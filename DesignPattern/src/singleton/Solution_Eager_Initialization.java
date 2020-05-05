package singleton;

public class Solution_Eager_Initialization {
	
	
	public static class Printer3 {
		// static ������ �ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ��� ����� �ʱ�ȭ
		// Eager Initialization
		private static Printer3 printer = new Printer3();
		
		private Printer3() {}
		
		// �ڱ� �ڽ��� �ν��Ͻ��� �ܺο� ����
		public static Printer3 getPrinter() {
			return printer;
		}
		
		public void print(String str) {
			System.out.println(str);
		}
		
		// Static ����
		// ��ü�� �����Ǳ� �� Ŭ������ �޸𸮿� �ε��� �� �������, �ʱ�ȭ�� �� ���� ����ȴ�.
		// ���α׷� ����~������� ���� ���� �ʰ�, �޸𸮿� ��� �����ϸ� Ŭ�������� ������ ��� ��ü���� ������ �� �ִ�.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
