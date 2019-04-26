package com.montes.beantest;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.montes.beans.qualifiers.Cowboys;
import com.montes.beans.qualifiers.Pantera;
import com.montes.beans.qualifiers.Thrash;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=com.montes.AppConfiguration.class)
@ContextConfiguration(locations = "file:src/main/resources/application-context.xml")
@ActiveProfiles("qa")
public class AppTest 
{
	@Value("${test.p}")
	String propertyValue;
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	@Thrash
	@Pantera
	@Cowboys
	private CompactDisk disk;
	
	@Autowired
	Environment env;
   
	@org.junit.Test
    public void playAgain() {
		
    	CDPlayer cd = (CDPlayer)player;
    	CowboysFromHell c = (CowboysFromHell)cd.cd;
    	c.setTitle("Otro nombre");
		player.play();
		System.out.println("Variable de prueba en properties: " + env.getProperty("test.p"));
    	
    }
    
    @org.junit.Test
    public void cdShouldNotBeNull() {
    	
    	
    	
    	assertNotNull(disk);
    	
    	CowboysFromHell c = (CowboysFromHell)disk;
    	disk.play();
    	c.setTitle("Slaughter modified");
    	disk.play();
    	System.out.println("Variable de prueba en properties leída con @Value: " + propertyValue);
    	
    }
    
    @org.junit.Test
    public void play() {
    	player.play();
    }
}
