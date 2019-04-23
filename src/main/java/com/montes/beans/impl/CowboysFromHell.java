package com.montes.beans.impl;

import com.montes.beans.CompactDisk;

public class CowboysFromHell implements CompactDisk{

	private String title = "Cowboys From Hell";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}
}
