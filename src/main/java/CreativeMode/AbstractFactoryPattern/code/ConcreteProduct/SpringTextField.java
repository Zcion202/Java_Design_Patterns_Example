package CreativeMode.AbstractFactoryPattern.code.ConcreteProduct;


import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;

public class SpringTextField implements TextField {
	@Override
	public void display(){
		System.out.println("this is Spring TextField!");
	}
}
