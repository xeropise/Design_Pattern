package singleton;

public class Static__class__and_Enum_Class {
	
	// 1) static 클래스
	public static class Printer5 {
	      private static int counter = 0;
	      // 메서드 동기화 (임계 구역)
	      public synchronized static void print(String str) {
	        counter++;
	        System.out.println(str + counter);
	      }
	}
	
	public static class UserThread extends Thread{
	    // 스레드 생성
	    public UserThread(int i) { super(); }
	    // 현재 스레드 이름 출력
	    public void run() {
	      Printer5.print(Thread.currentThread().getName());
	    }
	}
	
	public static class Client {
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
	
	// 정적 클래스를 이용하면, 객체를 전혀 생성하지 않고, 메서드를 사용한다
	// 정적 메서드를 사용하므로, 일반적으로 실행할 때 바인딩 되는(컴파일 타임에 바인딩 되는) 인스턴스 메서드를 사용하는 것보다 성능 면에서 우수
	
	// ** 정적 클래스를 사용할 수 없는 경우, **
	// 인터페이스를 구현해야 하는 경우, 정적 메서드는 인터페이스에서 사용할 수 없다.

	
	// 2) Enum 클래스
	
	public static enum SingletonTest {
		INSTANCE;
		
		public static SingletonTest getInstance() {
			return INSTANCE;
		}
	}
	
	// 불변(Thread-safety)과 직렬화(Serialization)이 보장된다.
	// Reflection을 통한 공격에도 안전하다.
	// 따라서 Enum을 이용해서, Singleton을 구현하는 것이 가장 좋은 방법이다.
}
