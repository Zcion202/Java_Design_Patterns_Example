package CreativeMode.BuilderPattern.code.v4;

import CreativeMode.BuilderPattern.code.v4.ActorBuilder;

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

	// 覆盖钩子方法
	public Boolean isBareHead(){
		return true;
	}
}
