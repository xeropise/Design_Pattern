package template;

public class TemplateMain {
	public static void main(String[] args) {
		
		// ����� ���� �غ� ���ؼ� 
		// ü���� �ܷ��ϰ�, ���� �۰�, ������ �Խ��ϴ�.
		Warrior warrior = new Warrior();
		warrior.readyToBattle();
		
		System.out.println("---");
		// �û�� ���� �غ� ���ؼ� 
		// ü���� �ܷ��ϰ�, Ȱ�� �����ϰ�, ȭ���� �غ��մϴ�.
		Archer archer = new Archer();
		archer.readyToBattle();
		
		System.out.println("---");
		
		// ������� ���� �غ� ���ؼ� 
		// ü���� �ܷ��ϰ�, �����̸� �غ��ϰ�, �κ긦 �Խ��ϴ�.
		Wizard wizard = new Wizard();
		wizard.readyToBattle();
		
		
		// ������ ����� ���� Ŭ�������� �����ϰ�,
		// Ȯ�� / ��ȭ�� �ʿ��� �κи� ����� �̿���, ���� Ŭ�������� ����
		
		// ���ø� �޼ҵ� ������
		// "�˰����� ����"�� ���ߴ� �Ϳ� ����
		// ��ü���� ���̾ƿ��� ���� ��Ű����, ��ӹ��� Ŭ������ �Ͽ��� ������� �������� �ֵ����ϴ� ������ ����
		// �߻� �޼ҵ�� �� �޼ҵ带 ������ ����ؼ� ��ü���� �˰����� ���븦 �����ϵ�, �����ϰ� ����� ������ �� �ֵ��� ���
	}
}
