package com.capgemini.com.day3;

public class Television {
	private boolean power;
	private int volume;
	private int channel;

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public Television()
	{
		
	}

	public int changeChannel(int newChannel)
	{
		if(power==true)
		{
			channel=newChannel;
			return channel;
		}
		return 0;
		
	}

	public int changeVolume(int newVolume)
	{
		if(power==true)
		{
			//volume=newVolume;
			if(volume<newVolume)
			{
				int n=newVolume-volume;
				for(int i=0;i<n;i++)
				{
					volume=volume+1;
				}
			}
			if(volume>newVolume)
			{
				int n=volume-newVolume;
				for(int i=0;i<n;i++)
				{
					volume=volume-1;
				}
			}
			
			return volume;
		}
		return 0;
	}

	public boolean powerStatus() {

		power=!power;
		return power;
	}
	public String televisionStatus()
	{
		if(power==true) {
		return ("Power: "+power+" | Channel: "+channel+" | Volume: "+volume);
		}
		return ("Power: "+power); 
	}
	}


