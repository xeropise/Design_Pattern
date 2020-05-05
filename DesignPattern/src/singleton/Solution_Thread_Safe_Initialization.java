package singleton;

public class Solution_Thread_Safe_Initialization {
	
	public static class Printer4 {
		// 외부에 제공할 자기 자신의 인스턴스
		private static Printer4 printer = null;
		private int counter = 0;
		private Printer4() {}
		
		// 인스턴스를 만드는 메서드 동기화 ( 임계 영역 설정 )
		public synchronized static Printer4 getPrinter() {
			if ( printer == null) {
				printer = new Printer4();
			}
			
			return printer;
		}
		
		public void print(String str) {
			// 오직 하나의 스레드만 접근을 허용함 ( 임계 영역 )
			// 성능을 위해 필요한 부분만을 임계 영역으로 설정한다.
			
			synchronized(this) {
				counter++;
				System.out.println(str + counter);
			}
		}
	}
	
	
	// 1) 인스턴스를 만드는 메서드를 임계 영역으로 변경
	//	다중 스레드 환경에서 동시에 여러 스레드가 getPrinter 메서드를 소유하는 객체에 접근 하는 것을 방지한다.
	// 2) 공유 변수에 접근하는 부분을 임계 영역으로 변경
	//	여러 개의 스레드가 하나뿐인 counter 변수 값에 동시에 접근해 갱신하는 것을 방지한다.
	// getInstance() 에 Lock을 하는 방식이라 속도가 느리다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
