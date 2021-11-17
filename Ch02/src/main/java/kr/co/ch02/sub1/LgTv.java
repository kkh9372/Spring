package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class LgTv implements Tv {
	
	@Autowired
	private Speaker speaker;
	
	
	@Override
	public void powerOn() {
		System.out.println("LgTv powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv powerOff...");		
	}

	@Override
	public void chUp() {
		System.out.println("LgTv chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("LgTv chDown...");
	}

	@Override
	public void soundUp() {
		speaker.soundUp();		
	}

	@Override
	public void soundDown() {
		speaker.soundDown();
	}
}
