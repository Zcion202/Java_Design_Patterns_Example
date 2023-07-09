package CreativeMode.PrototypePattern.code.v2;

public class Client {
	public static void main(String[] args) {
		Attachment attachment = new Attachment();

		// 浅克隆
		WeekLog_Shallow shallow_previous, shallow_new = null;
		shallow_previous = new WeekLog_Shallow();
		shallow_previous.setAttachment(attachment);
		shallow_new = shallow_previous.clone();
		if(shallow_previous.getAttachment() == shallow_new.getAttachment()){
			System.out.println("attachment相同");
		}else{
			System.out.println("attachment不相同");
		}
		if(shallow_previous == shallow_new){
			System.out.println("浅克隆原型和克隆相同");
		}else{
			System.out.println("浅克隆原型和克隆不相同");
		}

		// 深克隆
		WeekLog_Deep deep_previous, deep_new = null;
		deep_previous = new WeekLog_Deep();
		deep_previous.setAttachment(attachment);
		deep_new = deep_previous.clone();
		if(deep_previous.getAttachment() == deep_new.getAttachment()){
			System.out.println("attachment相同");
		}else{
			System.out.println("attachment不相同");
		}
		if(deep_previous == deep_new){
			System.out.println("深克隆原型和克隆相同");
		}else{
			System.out.println("深克隆原型和克隆不相同");
		}
	}
}
