package com.free.app.audiostory.utils;

public interface InstallerImpl {
	public boolean verifyData() throws Exception;
	public void downloadData()throws Exception;
	
	
	
	public static int STATE_DOWNLOADING=0;
	public static int STATE_VERIFYING=1;
	public static int STATE_DOWNLOAD_COMPLETED=2;
	public static int STATE_DOWNLOAD_ERROR=3;
	
	public static String DATA_URL="";
}
