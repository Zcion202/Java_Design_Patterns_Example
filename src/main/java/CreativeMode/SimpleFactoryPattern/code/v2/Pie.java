package CreativeMode.SimpleFactoryPattern.code.v2;

class Pie implements Chart {
	public Pie(){
		System.out.println("创建Pie");
	}
	public void display(){
		System.out.println("显示Pie");
	}
}
