package CreativeMode.PrototypePattern.code.v3;

import java.util.Hashtable;


/**
 * 懒汉式单例实现
 */
class PrototypeManager {
	private Hashtable hash = new Hashtable();
	private static PrototypeManager manager = new PrototypeManager();

	private PrototypeManager(){
		hash.put("far", new Far());
		hash.put("srs", new SRS());
	}

	public OfficialDocument getOfficialDocument(String key){
		return ((OfficialDocument)hash.get(key)).clone();
	}

	public static PrototypeManager getInstance(){
		return manager;
	}
}
