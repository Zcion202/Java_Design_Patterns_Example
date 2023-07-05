package CreativeMode.AbstractFactoryPattern.code.ConcreteProduct;


import CreativeMode.AbstractFactoryPattern.code.AbstractProduct.TextField;

public class SummerTextField implements TextField {
	@Override
	public void display(){
		System.out.println("this is Summer TextField!");
	}
}
