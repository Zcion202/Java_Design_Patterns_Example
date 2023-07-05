package CreativeMode.SimpleFactoryPattern.code.v1;

class Pie implements Chart {
	public Pie(){
		System.out.println("创建Pie");
	}
	public void display(){
		System.out.println("显示Pie");
	}
}
