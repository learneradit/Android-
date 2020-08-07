package com.example.gestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;

import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;



public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView AditText;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AditText=(TextView)findViewById(R.id.AditText);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        AditText.setText("OnsingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        AditText.setText("OnDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        AditText.setText("OnDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        AditText.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        AditText.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        AditText.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        AditText.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        AditText.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        AditText.setText("OnFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}