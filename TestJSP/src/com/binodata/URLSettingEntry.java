package com.binodata;

public class URLSettingEntry {
	
	public URLSettingEntry(String url, boolean includeOrNot)
	{
		this.setUrlStr(url);
		this.setIncludeOrExclude(includeOrNot);
	}
	
	private String _urlStr;

	public String getUrlStr() {
		return _urlStr;
	}

	public void setUrlStr(String urlStr) {
		this._urlStr = urlStr;
	}
	
	private boolean _includeOrExclude;
	
	public boolean isIncludeOrExclude(){
		return _includeOrExclude;
	}
	
	public void setIncludeOrExclude(boolean includeOrExclude){
		_includeOrExclude = includeOrExclude;
	}

}
