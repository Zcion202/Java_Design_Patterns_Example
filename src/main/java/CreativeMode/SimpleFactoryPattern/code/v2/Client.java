package CreativeMode.SimpleFactoryPattern.code.v2;

import uitl.XMLUtil;

import java.io.File;

public class Client {
	public static void main(String[] args) {
		String type = XMLUtil.getType(new File("src\\main\\java\\CreativeMode\\SimpleFactoryPattern\\code\\v2\\config.xml"));
		Chart chart = Factory.create(type);
		chart.display();
	}
}
