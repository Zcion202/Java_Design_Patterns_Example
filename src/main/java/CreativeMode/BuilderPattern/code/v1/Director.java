package CreativeMode.BuilderPattern.code.v1;

public class Director {
	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}

	public void setBuilder(Builder builder){
		this.builder = builder;
	}

	public Product constract(){
		builder.buildPropertyA();
		builder.buildPropertyB();
		builder.buildPropertyC();
		return builder.getResult();
	}
}
