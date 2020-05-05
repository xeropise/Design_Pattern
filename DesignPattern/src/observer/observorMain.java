package observer;

public class observorMain {

	public static void main(String[] args) {
		
		Singer mcJDM = new Singer(); // 가수 탄생
		
		// 팬생성
		SingerFan person1 = new SingerFan("일반인1");
		SingerFan person2 = new SingerFan("일반인2");
		
		//가수를 보고 팬든이 달라붙음
		mcJDM.addFan(person1);
		mcJDM.addFan(person2);
		
		mcJDM.speak(); // 가수가 말을 합니다.
		
		// 팬 한명이 가수를 보기 싫어해서 탈퇴합니다.
		mcJDM.deleteFan(person2);
		
		// 새로운 팬이 되기로 결심합니다.
		SingerFan person3 = new SingerFan("일반인3");
		mcJDM.addFan(person3);
		
		mcJDM.speak(); //가수가 말을합니다
		
		// 한 객체의 상태 변화에 따라 다른 객체의 상태도 연동되도록, 일 대 다 객체 의존관게를 구성 하는 패턴
		// 데이터 변경이 발생했을 경우, 상대 클래스나 객체에 의존하지 않으면서, 데이터변경을 통보하고자 할 때 유용
	}

}
