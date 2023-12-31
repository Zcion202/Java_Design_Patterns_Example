package CreativeMode.BuilderPattern.code.v2.ConcreteBuilder;

import CreativeMode.BuilderPattern.code.v2.AbstractBuilder.ActorBuilder;

public class AngelBuilder extends ActorBuilder {
	@Override
	public void builderType() {
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildFace() {
		actor.setFace("漂亮");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("白裙");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("披肩长发");
	}

	@Override
	public String toString() {
		return "AngelBuilder{" +
				"actor=" + actor +
				'}';
	}
}
