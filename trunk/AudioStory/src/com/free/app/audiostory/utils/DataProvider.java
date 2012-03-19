package com.free.app.audiostory.utils;

import java.io.File;

import android.graphics.Bitmap;
import android.net.Uri;

import com.free.app.audiostory.defs.Defs;

public class DataProvider implements DataProviderInterface, Defs {
	/**
	 * Về mặt hình ảnh trình diễn thì có thể đóng hình ảnh thằng vào file apk
	 * cũng được nhưng nhước điểm là nếu có khoảng 100 hình thì kích thước cũng
	 * vài Mb apk. Tất nhiên cũng có thể chấp nhận được.
	 * 
	 * Công việc của anh Đạt là thiết kế cái
	 */
	private DataProvider() {
	}

	public static DataProviderInterface getInstance() {
		return new DataProvider();
	}

	@Override
	public Uri getAudioUri() {
		return Uri.fromFile(new File(SAVE_SDCARD + AUDIO_FILE_NAME));
	}

	/**
	 * Input: truyền vào vị trí hiện tại mà file audio đang play.
	 * 
	 * Xử lý: Anh Đạt dựa vào Input đc truyền vào để trả về một hình ảnh tương
	 * ứng với vị trí đó. Phương pháp xử lý như thế nào thì tự nghĩ.
	 * 
	 * Output: hình ảnh dưới dạng Bitmap
	 */
	@Override
	public Bitmap getImageAtMediaPosition(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
}
