package template;

public class Archer extends Person {

	@Override
	void prepareWeapon() {
		System.out.println("Ȱ�� �����մϴ�.");

	}
	
	@Override
	void prepareArmor() {}

	@Override
	boolean isUsingPrepareOther() {
		
		return true;
	}

	@Override
	void prepareOther() {
		System.out.println("ȭ���� �غ��մϴ�.");
	}

	

}
