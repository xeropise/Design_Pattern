package singleton;

public class problem__race_condition {
	
	// ** ���� ���� ������ ����� **
	public static class Printer2 {
	    // �ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ�
	    private static Printer2 printer = null;
	    private Printer2() { }
	    // �ڱ� �ڽ��� �ν��Ͻ��� �ܺο� ����
	    public static Printer2 getPrinter(){
	      // ���� �˻� ���� (������ ����!)
	      if (printer == null) {
	        try {
	          // ������ �����ٸ� ����(������ ���� 1ms���� ����)
	          // ª�� ������ thread ������ ���ÿ� �ν��Ͻ��� 2���̻� �����ϰ� ��.. == �̱����� �ƴ�
	          Thread.sleep(1);
	        } catch (InterruptedException e) { }

	        // Printer �ν��Ͻ� ����
	        printer = new Printer2();
	      }
	      return printer;
	    }
	    public void print(String str) {
	      System.out.println(str);
	    }
	}
	
	// ������ ����
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
	      // UserThread �ν��Ͻ� ����
	      user[i] = new UserThread((i+1));
	      user[i].start();
	    }
	  }

}
