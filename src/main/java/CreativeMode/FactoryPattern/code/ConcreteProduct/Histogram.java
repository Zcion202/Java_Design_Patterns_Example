package CreativeMode.FactoryPattern.code.ConcreteProduct;

import CreativeMode.FactoryPattern.code.AbstractProduct.Chart;

public class Histogram implements Chart {
	public void display(){
		System.out.println("显示Histogram");
	}
}
