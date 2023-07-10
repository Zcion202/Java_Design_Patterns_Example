package CreativeMode.BuilderPattern.code.v2.AbstractBuilder;

import CreativeMode.BuilderPattern.code.v2.Product.Actor;

public abstract class ActorBuilder {

	protected Actor actor = new Actor();
	public abstract void builderType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();

	public Actor createActor(){
		return actor;
	}

}
