package facade;

public class Viewer {
	
	public void view() {
		
		Facade facade = new Facade("콜라","어벤져스");
		facade.view_Movie();
	}
}
