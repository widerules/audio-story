package com.free.app.audiostory.defs;
/**
 * Tất cả các define phải được đặt ở đây
 * @author phuoc.tranhuu
 *
 */
public interface Defs {
	public static int STATE_VERIFYING=0;
	public static int STATE_DOWNLOADING=1;
	public static int STATE_DOWNLOAD_COMPLETED=2;
	public static int STATE_DOWNLOAD_ERROR=3;
	
	public static String DATA_URL="http://ota.dad.org/???";
	public static String SAVE_SDCARD="/sdcard/truyen_audio/bach_tuyet_va_7_chu_lun/";
	public static String AUDIO_FILE_NAME="audio.mp3";
}
