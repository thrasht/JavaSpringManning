package com.montes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;
import com.montes.beans.impl.CDPlayer;
import com.montes.beans.impl.CowboysFromHell;
import com.montes.beans.impl.VulgarDisplayOfPower;

//@Configuration
//@ComponentScan
public class AppConfiguration {
	
	/*
	@Bean
	@Profile("dev")
	public CompactDisk cowboys() {
		return new CowboysFromHell();		
	}
	
	@Bean
	@Profile("qa")
	public CompactDisk vulgar() {
		return new VulgarDisplayOfPower();
	}
	
	@Bean
	public MediaPlayer cdPlayer (CompactDisk compactDisk) {
		return new CDPlayer(compactDisk);
	}
*/
}
