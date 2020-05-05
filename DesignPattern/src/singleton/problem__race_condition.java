package singleton;

public class problem__race_condition {
	
	// ** 경합 조건 강제로 만들기 **
	public static class Printer2 {
	    // 외부에 제공할 자기 자신의 인스턴스
	    private static Printer2 printer = null;
	    private Printer2() { }
	    // 자기 자신의 인스턴스를 외부에 제공
	    public static Printer2 getPrinter(){
	      // 조건 검사 구문 (문제의 원인!)
	      if (printer == null) {
	        try {
	          // 스레드 스케줄링 변경(스레드 실행 1ms동안 정지)
	          // 짧은 순간에 thread 여럿이 동시에 인스턴스를 2개이상 생성하게 됨.. == 싱글톤이 아님
	          Thread.sleep(1);
	        } catch (InterruptedException e) { }

	        // Printer 인스턴스 생성
	        printer = new Printer2();
	      }
	      return printer;
	    }
	    public void print(String str) {
	      System.out.println(str);
	    }
	}
	
	// 쓰레드 생성
	public static class UserThread extends Thread{
		  public UserThread(int i) { super(); }
		  public void run() {
		    Printer2 printer = Printer2.getPrinter();
		    printer.print(Thread.currentThread().getName() + " print using " + printer.toString());
		  }
		}
	
	 private static final int THREAD_NUM = 5;
	  public static void main(String[] args) {
	    UserThread[] user = new UserThread[THREAD_NUM];
	    for (int i = 0; i < THREAD_NUM; i++) {
	      // UserThread 인스턴스 생성
	      user[i] = new UserThread((i+1));
	      user[i].start();
	    }
	  }

}
