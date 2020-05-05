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
		
		
		// ���丮 �޼ҵ� ������ ����ϴ� ����?
		
		// Ŭ���� ���� ���յ��� ���߱� ���� ��
		// "���յ�" ��� ���� ������ ���� Ŭ������ �������� ������ �� �󸶳� �ٸ� Ŭ�������� ������ �ִ°�
		// ���丮 �޼ҵ� ������ ����ϴ� ��� ���� ��ü�� ������, ����ϴ� ���� ���� �ϰ� ���� Ŭ������ ���������ν� ���� ȿ������
		// �ڵ� ���� �� �� �ְ�, �������� �����Ѵ�, ��������� ���յ� ���� ���� �� �ִ�.
		

	}

}
