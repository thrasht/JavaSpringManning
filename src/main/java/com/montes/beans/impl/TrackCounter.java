package com.montes.beans.impl;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class TrackCounter {

	Map<Integer, Integer> trackCounter = new HashMap<>();
	
	@Pointcut("execution(* com.montes.beans.CompactDisk.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) { }

	
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		trackCounter.put(trackNumber, currentCount + 1);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounter.containsKey(trackNumber) ? trackCounter.get(trackNumber) : 0;
	}
}
