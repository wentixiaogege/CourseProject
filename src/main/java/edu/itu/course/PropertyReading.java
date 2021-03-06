package edu.itu.course;

import java.io.IOException;
import java.util.Properties;

import se.hirt.w1.Sensors;

public class PropertyReading {
	public String getDeviceName() {
		Properties props = new Properties();
		try {
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("deviceName");
		if (null == typeStr) {
			return "";
		}
		return typeStr;
	}
	public String getServerXbeeAddress() {
		Properties props = new Properties();
		try {
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("ServerXbeeAddress");
		if (null == typeStr) {
			return "";
		}
		return typeStr;
	}
	
	public String getServerBroadcastAddress() {
		Properties props = new Properties();
		try {
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("ServerBroadcastAddress");
		if (null == typeStr) {
			return "";
		}
		return typeStr;
	}
	public String getXbeeDevice() {
		Properties props = new Properties();
		try {
			
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
			
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("xbeeName");
		if (null == typeStr) {
			return "";
		}
		System.out.println(typeStr);
		return typeStr;
	}
	public String getXbeeBaud() {
		Properties props = new Properties();
		try {
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("xbeeBaud");
		if (null == typeStr) {
			return "";
		}
		return typeStr;
	}
	public String getDeviceId() {
		Properties props = new Properties();
		try {
			props.load(PropertyReading.class.getResourceAsStream("/xbee.properties"));
		} catch (IOException e) {
			System.out.println("Could not find sensors properties!");
			e.printStackTrace();
		}
		String typeStr = props.getProperty("deviceId");
		if (null == typeStr) {
			return "";
		}
		return typeStr;
	}
}
