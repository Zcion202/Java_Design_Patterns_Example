package CreativeMode.SingletonPattern.code.v2;

public class Client {
	public static void main(String[] args) {
		LoadBalancer balancer1 = LoadBalancer.getInstance();
		LoadBalancer balancer2 = LoadBalancer.getInstance();
		LoadBalancer balancer3 = LoadBalancer.getInstance();
		LoadBalancer balancer4 = LoadBalancer.getInstance();
		if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4){
			System.out.println("四台负载均衡器均出自同一台负载均衡器");
		}

		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");

		for (int i = 0; i < 10; i++) {
			System.out.println("分发请求至服务器：" + balancer1.getServer());
		}
	}
}
