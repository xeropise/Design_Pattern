package facade;

public class Movie {

    private String name="";
    
    public Movie(String name) {
        this.name = name;
    }
    
    public void Search_Movie() {
    	
        System.out.println(name+" ��ȭ�� ã��");
    }
    
    public void Charge_Movie(){
    	
        System.out.println("��ȭ�� �����ϴ�");
    }
    
    public void play_Movie(){
    	
        System.out.println("��ȭ ���");
    } 
    
}
