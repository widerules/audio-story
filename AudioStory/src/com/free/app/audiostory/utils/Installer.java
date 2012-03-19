package com.free.app.audiostory.utils;

public abstract class Installer implements InstallerImpl {
		
	@Override
	public boolean verifyData() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void downloadData() throws Exception {
		//TODO
	}
	
	public abstract boolean onDownloadCompleted();
	public abstract boolean onDownloading();
	public abstract boolean onDownloadError();
	public abstract boolean onStartDownload();
}
