package factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		RobotFactory rf = new SuperRobotFactory();
		Robot r = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");
		
		System.out.println(r.getName());
		System.out.println(r2.getName());
		
		RobotFactory mrf = new ModifiedSuperRobotFactory();
		Robot r3 = mrf.createRobot("pattern.factory.SuperRobot");
		Robot r4 = mrf.createRobot("pattern.factory.PowerRobot");
		
		System.out.println(r3.getName());
		System.out.println(r4.getName());
		
		
		// 팩토리 메소드 패턴을 사용하는 이유?
		
		// 클래스 간의 결합도를 낮추기 위한 것
		// "결합도" 라는 것은 간단히 말해 클래스의 변경점이 생겼을 때 얼마나 다른 클래스에도 영향을 주는가
		// 팩토리 메소드 패턴을 사용하는 경우 직접 객체를 생성해, 사용하는 것을 방지 하고 서브 클래스에 위임하으로써 보다 효율적인
		// 코드 제얼르 할 수 있고, 의존성을 제거한다, 결과적으로 결합도 또한 낮출 수 있다.
		

	}

}
