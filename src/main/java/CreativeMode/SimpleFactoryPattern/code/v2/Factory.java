package CreativeMode.SimpleFactoryPattern.code.v2;

public class Factory {
	public static Chart create(String type){
		if(type.equals("histogram")){
			return new Histogram();
		}
		else if(type.equals("pie")){
			return new Pie();
		}
		else if(type.equals("line")){
			return new Line();
		}
		return null;
	}
}
