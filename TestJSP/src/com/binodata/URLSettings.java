package com.binodata;

import java.util.Vector;

public class URLSettings {
	
	private Vector<URLSettingEntry> _urlSettings = new Vector<URLSettingEntry>();
	
	public URLSettings(){
		_urlSettings.add(new URLSettingEntry("http://www.google.com", true));
		_urlSettings.add(new URLSettingEntry("http://www.facebook.com", false));
		_urlSettings.add(new URLSettingEntry("http://www.apple.com", true));
	}
	
	public URLSettingEntry[] getURLSettings(){
		return _urlSettings.toArray(new URLSettingEntry[_urlSettings.size()]);
	}

}
