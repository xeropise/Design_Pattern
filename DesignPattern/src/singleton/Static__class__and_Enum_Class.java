package singleton;

public class Static__class__and_Enum_Class {
	
	// 1) static Ŭ����
	public static class Printer5 {
	      private static int counter = 0;
	      // �޼��� ����ȭ (�Ӱ� ����)
	      public synchronized static void print(String str) {
	        counter++;
	        System.out.println(str + counter);
	      }
	}
	
	public static class UserThread extends Thread{
	    // ������ ����
	    public UserThread(int i) { super(); }
	    // ���� ������ �̸� ���
	    public void run() {
	      Printer5.print(Thread.currentThread().getName());
	    }
	}
	
	public static class Client {
	    private static final int THREAD_NUM = 5;
	    public static void main(String[] args) {
	      UserThread[] user = new UserThread[THREAD_NUM];
	      for (int i = 0; i < THREAD_NUM; i++) {
	        // UserThread �ν��Ͻ� ����
	        user[i] = new UserThread((i+1));
	        user[i].start();
	      }
	    }
	}
	
	// ���� Ŭ������ �̿��ϸ�, ��ü�� ���� �������� �ʰ�, �޼��带 ����Ѵ�
	// ���� �޼��带 ����ϹǷ�, �Ϲ������� ������ �� ���ε� �Ǵ�(������ Ÿ�ӿ� ���ε� �Ǵ�) �ν��Ͻ� �޼��带 ����ϴ� �ͺ��� ���� �鿡�� ���
	
	// ** ���� Ŭ������ ����� �� ���� ���, **
	// �������̽��� �����ؾ� �ϴ� ���, ���� �޼���� �������̽����� ����� �� ����.

	
	// 2) Enum Ŭ����
	
	public static enum SingletonTest {
		INSTANCE;
		
		public static SingletonTest getInstance() {
			return INSTANCE;
		}
	}
	
	// �Һ�(Thread-safety)�� ����ȭ(Serialization)�� ����ȴ�.
	// Reflection�� ���� ���ݿ��� �����ϴ�.
	// ���� Enum�� �̿��ؼ�, Singleton�� �����ϴ� ���� ���� ���� ����̴�.
}
