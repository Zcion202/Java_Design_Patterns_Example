package CreativeMode.AbstractFactoryPattern.code.AbstractFactory;

import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.Button;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
}
