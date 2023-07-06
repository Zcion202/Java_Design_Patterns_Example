package CreativeMode.SingletonPattern.code.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	// 私有静态成员变量，存储唯一实例
	private static LoadBalancer instance = null;
	// 服务器集合
	private List serverList = null;

	// 私有构造函数
	private LoadBalancer(){
		serverList = new ArrayList();
	}

	// 公有静态成员方法，返回唯一实例
	public static LoadBalancer getInstance(){
		if(instance == null){
			instance = new LoadBalancer();
		}
		return instance;
	}

	public void addServer(String server){
		serverList.add(server);
	}

	public void removeServer(String server){
		serverList.remove(server);
	}

	public String getServer(){
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String) serverList.get(i);
	}
}
