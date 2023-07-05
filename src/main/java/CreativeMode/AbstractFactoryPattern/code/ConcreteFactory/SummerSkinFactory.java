package CreativeMode.AbstractFactoryPattern.code.ConcreteFactory;


import CreativeMode.AbstractFactoryPattern.code.AbstractFactory.SkinFactory;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.Button;
import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;
import CreativeMode.AbstractFactoryPattern.code.ConcreteProduct.SummerButton;
import CreativeMode.AbstractFactoryPattern.code.ConcreteProduct.SummerTextField;

public class SummerSkinFactory implements SkinFactory {
	@Override
	public Button createButton(){
		return new SummerButton();
	}
	@Override
	public TextField createTextField(){
		return new SummerTextField();
	}
}
