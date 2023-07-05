package CreativeMode.FactoryPattern.code.ConcreteFactory;

import CreativeMode.FactoryPattern.code.AbstractFactory.Factory;
import CreativeMode.FactoryPattern.code.AbstractProduct.Chart;
import CreativeMode.FactoryPattern.code.ConcreteProduct.Line;

public class LineFactory implements Factory {
	public Chart create(){
		return new Line();
	}
}
