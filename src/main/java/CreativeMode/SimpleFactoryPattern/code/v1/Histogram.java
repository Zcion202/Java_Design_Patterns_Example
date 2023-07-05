package CreativeMode.SimpleFactoryPattern.code.v1;

class Histogram implements Chart {
	public Histogram(){
		System.out.println("创建Histogram");
	}
	public void display(){
		System.out.println("显示Histogram");
	}
}
