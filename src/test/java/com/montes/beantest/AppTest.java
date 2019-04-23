package com.montes.beantest;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.montes.beans.CompactDisk;
import com.montes.beans.MediaPlayer;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.montes.AppConfiguration.class)
public class AppTest 
{
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisk disk;
   
    
    @org.junit.Test
    public void cdShouldNotBeNull() {
    	assertNotNull(disk);
    	disk.play();
    }
    
    @org.junit.Test
    public void play() {
    	player.play();
    }
}
