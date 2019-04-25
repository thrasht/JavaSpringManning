package com.montes.beans.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;
import com.montes.beans.qualifiers.Cowboys;
import com.montes.beans.qualifiers.Pantera;
import com.montes.beans.qualifiers.Thrash;

@Component
@Thrash
@Pantera
@Cowboys
public class CowboysFromHell implements CompactDisk{

	private String title = "Cowboys From Hell";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}
}
