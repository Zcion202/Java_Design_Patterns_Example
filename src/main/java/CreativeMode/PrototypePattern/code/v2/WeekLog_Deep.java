package CreativeMode.PrototypePattern.code.v2;

import java.io.*;

/**
 * 深克隆
 * 需要实现Serializable接口，利用序列化实现
 */
class WeekLog_Deep implements Serializable {
	private Attachment attachment;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public WeekLog_Deep clone(){
		try{
			// 写入流
			ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
			ObjectOutputStream objOutput = new ObjectOutputStream(byteOutput);
			objOutput.writeObject(this);

			// 从流中取出
			ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
			ObjectInputStream objInput = new ObjectInputStream(byteInput);
			return (WeekLog_Deep)objInput.readObject();
		}catch(Exception e){
			System.out.println("深克隆失败");
			e.printStackTrace();
			return null;
		}
	}
}
