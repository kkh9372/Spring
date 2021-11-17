package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/*
 * ��¥ : 2021/10/11
 * �̸� : ��ö��
 * ���� : ������ Ioc �ǽ��ϱ�
 * 
 * IoC(������ ����)
 *  - �ڹ� ��ü�� �����ϰ� ��ü�� ������ �������踦 ������ �����̳ʷ� ó���ϴ� ����
 *  - ������ IoC�� �̿��ؼ� ��ü���� ���յ��� ��ȭ ȿ�� 
 *  - IoC�� �����ϴ� ����� DI(Dependency Injection)
 *  - DI��� �� ������̼� ����� ���� ���� ��� 
 */
public class IocTest {
	
	public static void main(String[] args) {
		
		// IoC Ȱ������ ���� ��ü ����
		Tv tv1 = new LgTv();
		Tv tv2 = new SamsungTv();
		
		tv1.powerOn();
		tv1.chUp();
		tv1.powerOff();
		
		tv2.powerOn();
		tv2.chDown();
		tv2.powerOff();
		
		
		// ������ �����̳ʿ� ��ϵ� ��ü�� ������ �����ϴ� ��� 
		ApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
		
		Tv ltv = (Tv) ctx.getBean("ltv");
		Tv stv = (Tv) ctx.getBean("stv");
		
		ltv.powerOn();
		ltv.chUp();
		ltv.soundDown();
		ltv.powerOff();
		
		stv.powerOn();
		stv.chDown();
		stv.soundUp();
		stv.powerOff();
		
	}
}









