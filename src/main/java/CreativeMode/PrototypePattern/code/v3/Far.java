package CreativeMode.PrototypePattern.code.v3;

class Far implements OfficialDocument{
	public OfficialDocument clone(){
		OfficialDocument far = null;
		try{
			far = (OfficialDocument) super.clone();
		}catch (Exception e){
			System.out.println("Far不支持复制");
		}
		return far;
	}

	public void display(){
		System.out.println("this is Far");
	}
}
