package dynamicTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	
	private RealSubject rs=null;
	public DynamicProxy(RealSubject rs) {
		this.rs=rs;
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("befor...");
		arg1.invoke(rs, arg2);
		System.out.println("after...");
		return null;
	}

}
