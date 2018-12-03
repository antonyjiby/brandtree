package com.example.x.brandtree;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView image,image1,image2;
    private GestureDetectorCompat gestureDetectorCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        image = (ImageView)findViewById(R.id.imageView);
        image1 = (ImageView)findViewById(R.id.imageView3);
        image2 = (ImageView)findViewById(R.id.imageView7);


        gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
    }




    @Override
    protected void onStart() {
        super.onStart();
        image2.setVisibility(View.GONE);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        image.startAnimation(animation1);



        final Animation hide = AnimationUtils.loadAnimation(this, R.anim.bottomtop);
        image1.startAnimation(hide);



        final Animation fade = AnimationUtils.loadAnimation(this, R.anim.fade);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                image2.setVisibility(View.VISIBLE);
                image2.startAnimation(fade);
                Toast.makeText(getBaseContext(),
                        "Swipe towards left to continue",
                        Toast.LENGTH_LONG).show();
            }
        }, 5000);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class MyGestureListener implements GestureDetector.OnGestureListener {
        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {

        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            /*
         Toast.makeText(getBaseContext(),
          event1.toString() + "\n\n" +event2.toString(),
          Toast.LENGTH_SHORT).show();
         */

            if(event2.getX() < event1.getX()){

                //switch another activity
                Intent intent = new Intent(
                        MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
            }

            return true;
        }
    }
}
