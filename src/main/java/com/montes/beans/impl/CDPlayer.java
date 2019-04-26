package com.montes.beans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;
import com.montes.beans.qualifiers.Cowboys;
import com.montes.beans.qualifiers.Pantera;
import com.montes.beans.qualifiers.Thrash;
import com.montes.beans.qualifiers.Vulgar;


public class CDPlayer implements MediaPlayer{

	public CompactDisk cd;
	
	
	
	
	@Thrash
	@Pantera
	@Cowboys
	public CDPlayer(CompactDisk cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
		
	}

	
}
