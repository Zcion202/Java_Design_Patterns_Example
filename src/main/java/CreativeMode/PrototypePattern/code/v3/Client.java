package CreativeMode.PrototypePattern.code.v3;

public class Client {
	public static void main(String[] args) {
		PrototypeManager manager = PrototypeManager.getInstance();

		OfficialDocument far1 = manager.getOfficialDocument("far");
		OfficialDocument far2 = manager.getOfficialDocument("far");
		far1.display();
		System.out.println(far1 == far2);

		OfficialDocument srs1 = manager.getOfficialDocument("srs");
		OfficialDocument srs2 = manager.getOfficialDocument("srs");
		srs1.display();
		System.out.println(srs1 == srs2);
	}
}
