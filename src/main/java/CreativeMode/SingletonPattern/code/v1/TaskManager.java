package CreativeMode.SingletonPattern.code.v1;

public class TaskManager {
	private static TaskManager tm = null;

	// 构造函数定义私有，不让外界调用
	private TaskManager(){}

	// 提供静态方法获取单一的实例
	public static TaskManager getInstance(){
		if(tm == null){
			tm = new TaskManager();
		}
		return tm;
	}

	public void display(){
		System.out.println(tm);
	}

}
