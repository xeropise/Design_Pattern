package template;

public abstract class Person {
	
	// ������ �غ��մϴ�
	void readyToBattle() {
		startBodyTraining();
		prepareWeapon();
		prepareArmor();
		if( isUsingPrepareOther() ) {
			prepareOther();
		}
	}
	
	// ��� ���� Ŭ�������� ������ �� ������ final Ű���带 �ٿ����ϴ�.
	final void startBodyTraining() {
		System.out.println("ü���� �ܷ��մϴ�.");
	}
	
	// ���⸦ ������ �� ����մϴ�
	abstract void prepareWeapon();
	
	// ������ ��ĥ �� ����մϴ�
	abstract void prepareArmor();
	
	// ���� �ٸ� ���𰡸� ����Ϸ��� true�� �ٲ�� �Ѵ�.
	// �� �޼ҵ�� "��ŷ(Hooking)" �뵵�� ����Ѵ�.
	boolean isUsingPrepareOther() {
		return false;
	}
	
	// �ٸ� ���𰡰� �ʿ��ϸ� ����Ѵ�.
	// isUsingPrepareOther ���� ���� �������̵� �ؼ� ���
	void prepareOther() {};
}
