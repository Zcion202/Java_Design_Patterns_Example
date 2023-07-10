package CreativeMode.BuilderPattern.code.v4;

import CreativeMode.BuilderPattern.code.v4.ActorBuilder;
import CreativeMode.BuilderPattern.code.v4.Actor;

public class ActorController {
	public static Actor createActor(ActorBuilder builder){
		builder.builderType();
		builder.buildCostume();
		builder.buildFace();

		// 根据钩子方法判断是否需要实现
		if(!builder.isBareHead()) {
			builder.buildHairstyle();
		}
		builder.buildSex();
		return builder.createActor();
	}
}
