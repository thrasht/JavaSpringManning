package com.montes.beans.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;

@Component
@Primary
public class CowboysFromHell implements CompactDisk{

	private String title = "Cowboys From Hell";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}
}
