package dynamicTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		RealSubject rs=new RealSubject();
		InvocationHandler proxy=new DynamicProxy(rs);
		
		ClassLoader arg0=proxy.getClass().getClassLoader();
		Class []arg1=rs.getClass().getInterfaces();
		
		Proxy.newProxyInstance(arg0, arg1, proxy);
		
		System.out.println(rs.getClass().getName());
        rs.rent();
        rs.hello("world");
	}
}
