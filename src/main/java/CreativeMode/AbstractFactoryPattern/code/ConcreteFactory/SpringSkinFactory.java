package CreativeMode.AbstractFactoryPattern.code.ConcreteFactory;


import CreativeMode.AbstractFactoryPattern.code.AbstractFactory.SkinFactory;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.Button;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;
import CreativeMode.AbstractFactoryPattern.code.ConcreteProduct.SpringButton;
import CreativeMode.AbstractFactoryPattern.code.ConcreteProduct.SpringTextField;

public class SpringSkinFactory implements SkinFactory {
	@Override
	public Button createButton(){
		return new SpringButton();
	}
	@Override
	public TextField createTextField(){
		return new SpringTextField();
	}
}
