package CreativeMode.BuilderPattern.code.v2;

import CreativeMode.BuilderPattern.code.v2.AbstractBuilder.ActorBuilder;
import CreativeMode.BuilderPattern.code.v2.Director.ActorController;
import CreativeMode.BuilderPattern.code.v2.Product.Actor;
import uitl.XMLUtil;

import java.io.File;

public class Client {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\CreativeMode\\BuilderPattern\\code\\v2\\Config\\config.xml";
		ActorBuilder builder = (ActorBuilder) XMLUtil.getBean(new File(path));
		Actor actor = ActorController.createActor(builder);
		System.out.println(actor);
	}
}
