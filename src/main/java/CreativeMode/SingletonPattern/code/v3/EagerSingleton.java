package CreativeMode.SingletonPattern.code.v3;

/**
 * 饿汉式单例
 * 在定义静态私有成员变量时创建该对象
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	public static EagerSingleton getInstance(){
		return instance;
	}
}
