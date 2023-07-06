package CreativeMode.SingletonPattern.code.v3;

/**
 * 懒汉式单例
 * 定义静态私有成员变量时设置为null，在静态公有成员方法中实例化该变量
 * 属于延迟加载技术
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	private volatile static LazySingleton vo_instance = null;

	/**
	 * 在多线程环境下，以下方法会导致进程1在判断instance为null并创建instance的过程中，
	 * 进程2判断instance也为null，从而使静态变量instance被创建两次，导致错误
	 */
	public static LazySingleton getInstance1(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}

	/**
	 * 以下方法解决了多线程环境下多个线程判断instance为null成立的问题，
	 * 但这种实现方式在多线程高并发访问环境下会导致系统的性能下降
	 */
	synchronized public static LazySingleton getInstance2(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}

	/**
	 * 以下方法可以解决多线程高并发访问的系统的性能问题，
	 * 但依旧解决不了多线程判断instance为空成立的问题
	 * （synchronized没有把if判断包含在内）
	 */
	public static LazySingleton getInstance3(){
		if(instance == null){
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

	/**
	 * 以下方法可以解决以上出现的两个问题
	 * 这种方式称为双重检查锁定
	 * 使用这种方法时需要将静态成员变量instance（用vo_instance表示）修饰为volatile，确保该变量在多个线程中都能被正确处理
	 * volatile时jdk1.5的特性，会屏蔽调jvm的一些代码优化，可能导致系统性能下降，因此这种方法不一定是最优解
	 * （感觉是为了解释双重检查锁定而出现的例子，为啥不一开始判断时就直接锁定代码块呢）
	 */
	public static LazySingleton getInstance4(){
		// 第一重判断
		if(vo_instance == null){
			// 锁定代码块
			synchronized (LazySingleton.class){
				// 第二重判断
				if(vo_instance == null){
					vo_instance = new LazySingleton();
				}
			}
		}
		return vo_instance;
	}
}
