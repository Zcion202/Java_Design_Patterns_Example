package CreativeMode.PrototypePattern.code.v1;

/**
 * 原型模式通用方法
 */
class ConcretePrototype implements Prototype{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Prototype clone(){
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setData(this.data);
		return prototype;
	}
}
