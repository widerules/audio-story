package com.free.app.audiostory.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class TransparentButton extends Button{

	private Paint	innerPaint, borderPaint ;
	public TransparentButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
	private void init() {
		setBackgroundDrawable(null);
		innerPaint = new Paint();
		innerPaint.setARGB(80, 51, 0, 51); //gray
		innerPaint.setAntiAlias(true);

		borderPaint = new Paint();
		borderPaint.setARGB(255, 255, 255, 255);
		borderPaint.setAntiAlias(true);
		borderPaint.setStyle(Style.STROKE);
		//borderPaint.setStrokeWidth(1);
	}
	
	
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch(event.getAction()){
		case MotionEvent.ACTION_DOWN:
			setBackgroundColor(Color.argb(80, 255, 214, 66));
			break;
		case MotionEvent.ACTION_UP:
			setBackgroundDrawable(null);
		}
		
		return super.onTouchEvent(event);
	}

	
	
	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
		RectF drawRect = new RectF();
    	drawRect.set(0,0, getMeasuredWidth(), getMeasuredHeight());
    	
    	canvas.drawRoundRect(drawRect, 0, 0, innerPaint);
		canvas.drawRoundRect(drawRect, 0, 0, borderPaint);
	}

}
