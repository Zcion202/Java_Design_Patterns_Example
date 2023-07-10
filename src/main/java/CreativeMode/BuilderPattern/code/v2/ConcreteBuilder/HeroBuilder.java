package CreativeMode.BuilderPattern.code.v2.ConcreteBuilder;

import CreativeMode.BuilderPattern.code.v2.AbstractBuilder.ActorBuilder;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void builderType() {
		actor.setType("英雄");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("英俊");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("盔甲");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("飘逸");
	}

	@Override
	public String toString() {
		return "HeroBuilder{" +
				"actor=" + actor +
				'}';
	}
}
