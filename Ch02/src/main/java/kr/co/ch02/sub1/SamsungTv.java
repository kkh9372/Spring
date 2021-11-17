package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SamsungTv implements Tv {
	
	@Autowired
	private Speaker speaker;
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTv powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv powerOff...");		
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTv chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("SamsungTv chDown...");
	}
	
	@Override
	public void soundUp() {
		// 林涝等 speaker 角青
		speaker.soundUp();		
	}

	@Override
	public void soundDown() {
		// 林涝等 speaker 角青
		speaker.soundDown();
	}

}
