package CreativeMode.SimpleFactoryPattern.code.v1;

class Line implements Chart {
	public Line(){
		System.out.println("创建Line");
	}
	public void display(){
		System.out.println("显示Line");
	}
}
