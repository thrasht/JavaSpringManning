package com.montes.beantest;

import org.springframework.beans.factory.annotation.Autowired;

import com.montes.beans.CompactDisk;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
    private CompactDisk disk;
	
    public static void main( String[] args )
    {
    	
    }
    
}
