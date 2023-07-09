package CreativeMode.PrototypePattern.code.v2;

import java.io.Serializable;

class Attachment implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void download(){
		System.out.println("attach " + name + " is downloading");
	}
}
