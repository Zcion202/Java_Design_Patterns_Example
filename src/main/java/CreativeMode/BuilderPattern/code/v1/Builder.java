package CreativeMode.BuilderPattern.code.v1;

abstract class Builder {
	protected Product product = new Product();

	public abstract void buildPropertyA();
	public abstract void buildPropertyB();
	public abstract void buildPropertyC();

	public Product getResult(){
		return product;
	}
}
