package CreativeMode.PrototypePattern.code.v2;

/**
 * 浅克隆
 * 利用Object的clone实现，需要实现Cloneable接口
 */
class WeekLog_Shallow implements Cloneable{
	private Attachment attachment;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public WeekLog_Shallow clone(){
		Object obj = null;
		try{
			obj = super.clone();
			return (WeekLog_Shallow)obj;
		}catch (CloneNotSupportedException e){
			System.out.println("not supported clone");
			e.printStackTrace();
			return null;
		}
	}
}
