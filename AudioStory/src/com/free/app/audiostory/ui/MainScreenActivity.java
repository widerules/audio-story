package com.free.app.audiostory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
}