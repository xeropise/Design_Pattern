package observer;

public class observorMain {

	public static void main(String[] args) {
		
		Singer mcJDM = new Singer(); // ���� ź��
		
		// �һ���
		SingerFan person1 = new SingerFan("�Ϲ���1");
		SingerFan person2 = new SingerFan("�Ϲ���2");
		
		//������ ���� �ҵ��� �޶����
		mcJDM.addFan(person1);
		mcJDM.addFan(person2);
		
		mcJDM.speak(); // ������ ���� �մϴ�.
		
		// �� �Ѹ��� ������ ���� �Ⱦ��ؼ� Ż���մϴ�.
		mcJDM.deleteFan(person2);
		
		// ���ο� ���� �Ǳ�� ����մϴ�.
		SingerFan person3 = new SingerFan("�Ϲ���3");
		mcJDM.addFan(person3);
		
		mcJDM.speak(); //������ �����մϴ�
		
		// �� ��ü�� ���� ��ȭ�� ���� �ٸ� ��ü�� ���µ� �����ǵ���, �� �� �� ��ü �������Ը� ���� �ϴ� ����
		// ������ ������ �߻����� ���, ��� Ŭ������ ��ü�� �������� �����鼭, �����ͺ����� �뺸�ϰ��� �� �� ����
	}

}
