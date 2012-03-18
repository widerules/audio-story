package com.free.app.audiostory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;

import com.free.app.audiostory.R;

public class MainScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
    }
    
    public void onClick_Nghe(View v){
    	startActivity(new Intent(this, AudioStoryActivity.class));
    }
    
    public void onClick_Library(View v){
    	startActivity(new Intent(this, LibraryActivity.class));
    }
    
    public void onClick_Share(View v){
    	Intent share = new Intent(Intent.ACTION_SEND);
		share.setType("text/plain");
		share.putExtra(Intent.EXTRA_TEXT, makeClipboardShareContent());
		startActivity(Intent.createChooser(share, "Chọn phương thức chia sẻ"));
    }
    
    private String makeClipboardShareContent() {
		ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
		String text_to_share = "Share content";
		clipboard.setText(text_to_share);
		return text_to_share;
	}
}