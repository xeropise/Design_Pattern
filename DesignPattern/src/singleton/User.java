package singleton;

public class User {
	
	private int name;
	
	public User(int i) { this.name = i; }
	
	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString());
	}

	
	public static class Client {
		private static final int USER_NUM = 5;

		public static void main(String[] args) {
			
			User[] user = new User[USER_NUM];
			
			for (int i=0; i < USER_NUM; i++) {
				
				// User 인스턴스 생성
				user[i] = new User((i+1));
				user[i].print();
			}

		}
	}
}


