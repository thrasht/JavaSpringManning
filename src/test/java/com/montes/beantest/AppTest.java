package com.montes.beantest;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	@Thrash
	@Pantera
	@Cowboys
	private CompactDisk disk;
   
	@org.junit.Test
    public void playAgain() {
    	CDPlayer cd = (CDPlayer)player;
    	CowboysFromHell c = (CowboysFromHell)cd.cd;
    	c.setTitle("Otro nombre");
		player.play();
    	
    }
    
    @org.junit.Test
    public void cdShouldNotBeNull() {
    	assertNotNull(disk);
    	
    	CowboysFromHell c = (CowboysFromHell)disk;
    	disk.play();
    	c.setTitle("Slaughter modified");
    	disk.play();
    	
    }
    
    @org.junit.Test
    public void play() {
    	player.play();
    }
}
