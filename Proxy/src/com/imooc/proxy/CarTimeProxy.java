package com.imooc.proxy;
/*
 * ͨ���ۺϷ�ʽ���������ݽ���
 * ����move()����������ǰ������ҵ���߼�
 */
public class CarTimeProxy implements Moveable {

	private Moveable m;
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		m.move();
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ������"+"��ʱ��"+
		(endtime-starttime)+"����");
	}

}
