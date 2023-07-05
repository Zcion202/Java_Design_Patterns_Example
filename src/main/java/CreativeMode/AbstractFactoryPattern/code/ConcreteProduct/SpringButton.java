package CreativeMode.AbstractFactoryPattern.code.ConcreteProduct;


import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.Button;

public class SpringButton implements Button {
	@Override
	public void display(){
		System.out.println("this is spring button!");
	}
}
