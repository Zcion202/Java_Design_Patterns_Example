package CreativeMode.AbstractFactoryPattern.code;

import CreativeMode.AbstractFactoryPattern.code.AbstractFactory.SkinFactory;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.Button;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;
import uitl.XMLUtil;

import java.io.File;

public class Client {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\CreativeMode\\AbstractFactoryPattern\\code\\config\\config.xml";
		SkinFactory sf = (SkinFactory) XMLUtil.getBean(new File(path));
		Button button = sf.createButton();
		TextField textField = sf.createTextField();
		button.display();
		textField.display();

	}
}
