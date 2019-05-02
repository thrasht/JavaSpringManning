package com.montes.beans.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;

public class BlankDisc implements CompactDisk {

	private String title;
	private String artist;
	private List<String> trackList = new ArrayList<>();
	
	public BlankDisc() {
		
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTrackList() {
		return trackList;
	}

	public void setTrackList(List<String> trackList) {
		this.trackList = trackList;
	}

	@Override
	public void play() {
		
	}
	
	public void playTrack(int trackNumber) {
		System.out.println("Playing " + trackList.get(trackNumber) + " by " + artist);
	}

}
