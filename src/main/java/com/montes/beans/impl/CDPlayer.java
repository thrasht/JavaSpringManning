package com.montes.beans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer{

	CompactDisk cd;
	
	
	@Autowired
	public void setCompactDisk(CompactDisk cd) {
		this.cd = cd;
	}
	
	public CDPlayer(CompactDisk cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
		
	}

	
}
