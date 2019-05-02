package com.montes.beans.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;
import com.montes.beans.qualifiers.Cowboys;
import com.montes.beans.qualifiers.Pantera;
import com.montes.beans.qualifiers.Thrash;

@Thrash
@Pantera
@Cowboys
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CowboysFromHell implements CompactDisk{

	private String title = "Cowboys From Hell";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
