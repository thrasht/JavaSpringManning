package com.montes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.montes.beans.CompactDisk;
import com.montes.beans.impl.BlankDisc;
import com.montes.beans.impl.TrackCounter;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfiguration {

	@Bean
	public CompactDisk animals() {
		BlankDisc cd = new BlankDisc();
		System.out.println("Creando bean animals");
		
		cd.setArtist("Pink Floyd");
		cd.setTitle("Animals");
		
		List<String> tracks = new ArrayList<String>();
		tracks.add("Pigson the Wing 1");
		tracks.add("Dogs");
		tracks.add("Pigs");
		tracks.add("Sheep");
		tracks.add("Pigson the Wing 2");
		
		cd.setTrackList(tracks);
		
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
