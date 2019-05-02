package com.montes.beantest;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;
import com.montes.beans.impl.CDPlayer;
import com.montes.beans.impl.CowboysFromHell;
import com.montes.beans.impl.TrackCounter;
import com.montes.beans.qualifiers.Cowboys;
import com.montes.beans.qualifiers.Pantera;
import com.montes.beans.qualifiers.Thrash;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.montes.BeanConfiguration.class)
//@ContextConfiguration(locations = "file:src/main/resources/application-context.xml")
public class AppTest 
{
	
	@Autowired
	private CompactDisk animals;
	
	@Autowired
	private TrackCounter trackCounter;
	
    
    @org.junit.Test
    public void playAnimals() {
    	animals.playTrack(1);
    	animals.playTrack(2);
    	animals.playTrack(1);
    	animals.playTrack(3);
    	animals.playTrack(1);
    	animals.playTrack(4);
    	animals.playTrack(1);
    	animals.playTrack(0);
    	animals.playTrack(4);
    	animals.playTrack(3);
    	
    	System.out.println(trackCounter.getPlayCount(1));
    	System.out.println(trackCounter.getPlayCount(2));
    	System.out.println(trackCounter.getPlayCount(3));
    	System.out.println(trackCounter.getPlayCount(4));
    	System.out.println(trackCounter.getPlayCount(0));
    }
    
    
}
