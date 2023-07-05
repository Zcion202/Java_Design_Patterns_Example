package CreativeMode.FactoryPattern.code.ConcreteFactory;

import CreativeMode.FactoryPattern.code.AbstractFactory.Factory;
import CreativeMode.FactoryPattern.code.AbstractProduct.Chart;
import CreativeMode.FactoryPattern.code.ConcreteProduct.Pie;

public class PieFactory implements Factory {
	public Chart create(){
		return new Pie();
	}
}
