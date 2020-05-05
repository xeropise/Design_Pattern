package singleton;

public class Solution_Eager_Initialization {
	
	
	public static class Printer3 {
		// static 변수에 외부에 제공할 자기 자신의 인스턴스를 만들어 초기화
		// Eager Initialization
		private static Printer3 printer = new Printer3();
		
		private Printer3() {}
		
		// 자기 자신의 인스턴스를 외부에 제공
		public static Printer3 getPrinter() {
			return printer;
		}
		
		public void print(String str) {
			System.out.println(str);
		}
		
		// Static 변수
		// 객체가 생성되기 전 클래스가 메모리에 로딩될 때 만들어져, 초기화가 한 번만 실행된다.
		// 프로그램 시작~종료까지 없어 지지 않고, 메모리에 계속 상주하며 클래스에서 생성된 모든 객체에서 참조할 수 있다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
