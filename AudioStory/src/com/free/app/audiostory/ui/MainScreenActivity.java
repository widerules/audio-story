package com.free.app.audiostory.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;

import com.free.app.audiostory.R;
import com.free.app.audiostory.defs.Defs;

public class MainScreenActivity extends Activity implements Defs{
    ProgressDialog progDialog;
    int maxValue=100;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        showDialog(STATE_DOWNLOADING);
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
    
    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id) {
        case STATE_VERIFYING:                      // Spinner
            progDialog = new ProgressDialog(this);
            progDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDialog.setMessage("Verifying data...");
            return progDialog;
        case STATE_DOWNLOADING:                      // Horizontal
            progDialog = new ProgressDialog(this);
            progDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progDialog.setMax(maxValue);
            progDialog.setMessage("Downloading...");
            
            return progDialog;
        case STATE_DOWNLOAD_COMPLETED:
        case STATE_DOWNLOAD_ERROR:
            return null;
        }
        return null;
    }
}