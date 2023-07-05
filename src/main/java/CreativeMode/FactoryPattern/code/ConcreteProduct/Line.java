package CreativeMode.FactoryPattern.code.ConcreteProduct;

import CreativeMode.FactoryPattern.code.AbstractProduct.Chart;

public class Line implements Chart {
	public void display(){
		System.out.println("显示Line");
	}
}
