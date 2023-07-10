package CreativeMode.BuilderPattern.code.v2.ConcreteBuilder;

import CreativeMode.BuilderPattern.code.v2.AbstractBuilder.ActorBuilder;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void builderType() {
		actor.setType("恶魔");
	}

	@Override
	public void buildSex() {
		actor.setSex("妖");
	}

	@Override
	public void buildFace() {
		actor.setFace("丑陋");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("黑衣");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("光头");
	}

	@Override
	public String toString() {
		return "DevilBuilder{" +
				"actor=" + actor +
				'}';
	}
}
