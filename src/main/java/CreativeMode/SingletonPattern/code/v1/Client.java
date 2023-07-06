package CreativeMode.SingletonPattern.code.v1;

public class Client {
	public static void main(String[] args) {
		TaskManager tm1 = TaskManager.getInstance();
		TaskManager tm2 = TaskManager.getInstance();
		tm1.display();
		tm2.display();
	}

}
