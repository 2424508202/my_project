package com.spring.helloworld;

public class Test {

	public static void main(String[] args) {
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingImpl();
//		ArithmeticCalculator target=new ArithmeticCalculatorImpl();
//		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result=proxy.add(1, 2);
		System.out.println(result);
		result=proxy.div(4, 2);
		System.out.println(result);
	}

}
