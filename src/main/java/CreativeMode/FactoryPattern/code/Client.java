package CreativeMode.FactoryPattern.code;

import CreativeMode.FactoryPattern.code.AbstractFactory.Factory;
import CreativeMode.FactoryPattern.code.AbstractProduct.Chart;
import uitl.XMLUtil;

import java.io.File;

public class Client {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\CreativeMode\\FactoryPattern\\code\\config\\config.xml";
		Factory factory = (Factory) XMLUtil.getBean(new File(path));
		Chart chart = factory.create();
		chart.display();
	}
}
