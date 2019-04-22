package com.montes.beans.impl;

import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;

@Component
public class VulgarDisplayOfPower implements CompactDisk {

	private String title = "Vulgar Display of Power";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}
	

}
