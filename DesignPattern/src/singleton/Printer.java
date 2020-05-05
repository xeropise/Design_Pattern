package singleton;

import javax.annotation.Resource;

public class Printer {
	// Printer 클래스를 사용해 프린터를 이용하려면, Client 프로그램에서 new Printer()가 반드시 한 번만 호출되도록 주의 해야한다.
	// 이를 해소하기 위해 생성자를 외부에서 호출할 수 없게 한다.
	private Printer() { }	// Printer 생성자를 외부에서 사용 불가
	
	// 외부에 제공할 자기 자신의 인스턴스 
	private static Printer printer = null;
	
	// 자기 자신의 인스턴스를 외부에 제공
	public static Printer getPrinter() {
		if (printer == null) {
			// Printer 인스턴스 생성
			printer = new Printer();
		}
		
		return printer;
	}
	public void print(String str) { System.out.println(str); }
	
	// 자기 자신 프린터에 대한 인스턴스를 하나 만들어 외부에 제공해줄 메서드가 필요하다.
	// static 메서드 / static 변수
	//	- 구체적인 인스턴스에 속하는 영역이 아니고 클래스 자체에 속한다.
	//	- 클래스의 인스턴스를 통하지 않고서도, 메서드를 실행할 수 있고 변수를 참조 할 수 있다.
	//	만약 new Printer()가 호출되기 전이면, 인스턴스 메서드인 print() 메서드는 호출할 수 없다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
