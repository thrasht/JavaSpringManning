package com.montes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;
import com.montes.beans.impl.CDPlayer;
import com.montes.beans.impl.CowboysFromHell;
import com.montes.beans.impl.VulgarDisplayOfPower;

@Configuration
//@ComponentScan
public class AppConfiguration {
	
	@Bean
	public CompactDisk randomPanteraDisk() {
		int choice = (int) Math.floor(Math.random() * 2);
		
		switch(choice) {
			case 0:
				return new CowboysFromHell();
			case 1:
				return new VulgarDisplayOfPower();
				
			default:
				return null;
		}
		
	}
	
	@Bean
	public MediaPlayer cdPlayer (CompactDisk compactDisk) {
		return new CDPlayer(compactDisk);
	}

}
