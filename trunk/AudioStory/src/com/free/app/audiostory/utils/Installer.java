package com.free.app.audiostory.utils;

public abstract class Installer implements InstallerImpl {

	@Override
	public boolean verifyData() throws Exception {

		return false;
	}

	@Override
	public void downloadData() throws Exception {

	}

	// notify when download completed
	public abstract boolean onDownloadCompleted();

	public abstract boolean onDownloading(long total_bytes_downloaded);

	// Call this function when have whatever exception
	public abstract boolean onDownloadError(String message);

	// Need to call this function before download and provide param size of data
	// pack in server by long variant
	public abstract boolean onStartDownload(long size_of_data);
}
