package com.imooc.proxy;

public class Main {
	public static void main(String[] args) {
//		Car car=new Car();
//		car.move();
		
//		Moveable car=new Car2();
//		car.move();
//		
//		Car car=new Car();
//		Moveable m=new CarTimeProxy(car);
//		m.move();
		Car car=new Car();
		CarTimeProxy ctp=new CarTimeProxy(car);
		CarLogProxy clp=new CarLogProxy(ctp);
		clp.move();	
	}
}
