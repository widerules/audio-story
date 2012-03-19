package com.free.app.audiostory.utils;

import android.graphics.Bitmap;
import android.net.Uri;

public interface DataProviderInterface {
	
	public Uri getAudioUri();
	public Bitmap getImageAtMediaPosition(int index);
}
