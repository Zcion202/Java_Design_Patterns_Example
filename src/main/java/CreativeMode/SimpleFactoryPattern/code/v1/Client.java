package CreativeMode.SimpleFactoryPattern.code.v1;

public class Client {
	public static void main(String[] args) {
		Chart chart = Factory.create("line");
		chart.display();
	}
}
