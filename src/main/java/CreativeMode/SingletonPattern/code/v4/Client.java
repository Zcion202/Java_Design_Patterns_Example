package CreativeMode.SingletonPattern.code.v4;

public class Client {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		if(instance1 == instance2){
			System.out.println(true);
		}
	}
}
