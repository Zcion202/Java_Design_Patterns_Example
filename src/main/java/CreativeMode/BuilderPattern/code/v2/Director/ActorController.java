package CreativeMode.BuilderPattern.code.v2.Director;

import CreativeMode.BuilderPattern.code.v2.AbstractBuilder.ActorBuilder;
import CreativeMode.BuilderPattern.code.v2.Product.Actor;

public class ActorController {
	public static Actor createActor(ActorBuilder builder){
		builder.builderType();
		builder.buildCostume();
		builder.buildFace();
		builder.buildHairstyle();
		builder.buildSex();
		return builder.createActor();
	}
}
