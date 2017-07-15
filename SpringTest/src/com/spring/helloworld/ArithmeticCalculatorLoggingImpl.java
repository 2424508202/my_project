package com.spring.helloworld;
/*
 * 包含有日志
 */
public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println(i+j);
		int result=i+j;
		System.out.println(result);
		return result;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println(i+j);
		int result=i-j;
		System.out.println(result);
		return result;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println(i+j);
		int result=i*j;
		System.out.println(result);
		return result;
	}

	@Override
	public int div(int i, int j) {
		System.out.println(i+j);
		int result=i/j;
		System.out.println(result);
		return result;
	}

}
