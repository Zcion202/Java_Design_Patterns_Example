package CreativeMode.SingletonPattern.code.v4;

/**
 * IoDH(Initialization Demand Holder)
 * 在单例类中增加一个静态内部类，在内部类中创建单例对象
 * 由于单例对象不是Singleton的成员变量，所以在类加载阶段不会实例化Singleton
 * 第一次调用getInstance时会加载内部静态类，实现了延迟加载
 * 由jvm来确保其线程安全，又不影响系统性能
 */
public class Singleton {
	private Singleton(){}

	private static class Holder{
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance(){
		return Holder.instance;
	}
}
