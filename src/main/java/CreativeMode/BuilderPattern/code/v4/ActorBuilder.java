package CreativeMode.BuilderPattern.code.v4;

import CreativeMode.BuilderPattern.code.v4.Actor;

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

	// 钩子方法，设置默认值
	public Boolean isBareHead(){
		return true;
	}

}
