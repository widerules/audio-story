package com.free.app.audiostory.utils;

import android.graphics.Bitmap;
import android.net.Uri;

public interface DataProviderInterface {
	public String getStoryTitle();
	public String getStoryContent();
	
	public Uri getAudioUri();
	public Bitmap getImageBitmapAtIndex(int index);
	public String getTextBlockAtIndex(int index);
}
