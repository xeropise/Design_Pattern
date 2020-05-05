package template;

public class TemplateMain {
	public static void main(String[] args) {
		
		// 전사는 전투 준비를 위해서 
		// 체력을 단련하고, 검을 닦고, 갑옷을 입습니다.
		Warrior warrior = new Warrior();
		warrior.readyToBattle();
		
		System.out.println("---");
		// 궁사는 전투 준비를 위해서 
		// 체력을 단련하고, 활을 손질하고, 화살을 준비합니다.
		Archer archer = new Archer();
		archer.readyToBattle();
		
		System.out.println("---");
		
		// 마법사는 전투 준비를 위해서 
		// 체력을 단련하고, 지팡이를 준비하고, 로브를 입습니다.
		Wizard wizard = new Wizard();
		wizard.readyToBattle();
		
		
		// 동일한 기능을 상위 클래스에서 정의하고,
		// 확장 / 변화가 필요한 부분만 상속을 이용해, 서브 클래스에서 구현
		
		// 템플릿 메소드 패턴은
		// "알고리즘의 뼈대"를 맞추는 것에 있음
		// 전체적인 레이아웃을 통일 시키지만, 상속받은 클래스로 하여금 어느정도 유연성을 주도록하는 디자인 패턴
		// 추상 메소드와 훅 메소드를 적절히 사용해서 전체적인 알고리즘의 뼈대를 유지하되, 유연하게 기능을 변경할 수 있도록 사용
	}
}
