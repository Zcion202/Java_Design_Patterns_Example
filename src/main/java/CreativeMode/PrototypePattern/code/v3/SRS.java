package CreativeMode.PrototypePattern.code.v3;

class SRS implements OfficialDocument{
	public OfficialDocument clone(){
		OfficialDocument srs = null;
		try{
			srs = (OfficialDocument)super.clone();
		}catch(Exception e){
			System.out.println("SRS不支持复制");
		}
		return srs;
	}

	public void display(){
		System.out.println("this is SRS");
	}
}
