package com.example.x.brandtree;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private GestureDetectorCompat gestureDetectorCompatSecond;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gestureDetectorCompatSecond = new GestureDetectorCompat(this, new MyGestureListenerSecond());
        img1 = (ImageView)findViewById(R.id.imageView4);
        img2 = (ImageView)findViewById(R.id.imageView2);
        img3 = (ImageView)findViewById(R.id.imageView5);
        img4 = (ImageView)findViewById(R.id.imageView6);
        img5 = (ImageView)findViewById(R.id.imageView8);
        img6 = (ImageView)findViewById(R.id.imageView9);
        img7 = (ImageView)findViewById(R.id.imageView10);
        img8 = (ImageView)findViewById(R.id.imageView11);
        img9 = (ImageView)findViewById(R.id.imageView12);
        img10 = (ImageView)findViewById(R.id.imageView13);

    }


    @Override
    protected void onStart() {
        super.onStart();
        img1.setVisibility(View.GONE);
        img2.setVisibility(View.GONE);
        img3.setVisibility(View.GONE);
        img5.setVisibility(View.GONE);
        img6.setVisibility(View.GONE);
        img7.setVisibility(View.GONE);
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.GONE);
        Animation hide = AnimationUtils.loadAnimation(this, R.anim.bottomtop);
        img4.startAnimation(hide);



        final Animation fady = AnimationUtils.loadAnimation(this, R.anim.fade2);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(fady);
            }
        }, 1000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img2.setVisibility(View.VISIBLE);
                img2.startAnimation(fady);
            }
        }, 1500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img3.setVisibility(View.VISIBLE);
                img3.startAnimation(fady);
            }
        }, 2000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img5.setVisibility(View.VISIBLE);
                img5.startAnimation(fady);
            }
        }, 2500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img6.setVisibility(View.VISIBLE);
                img6.startAnimation(fady);
            }
        }, 3000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img7.setVisibility(View.VISIBLE);
                img7.startAnimation(fady);
            }
        }, 3500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img8.setVisibility(View.VISIBLE);
                img8.startAnimation(fady);
            }
        }, 4000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img9.setVisibility(View.VISIBLE);
                img9.startAnimation(fady);
            }
        }, 4500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img10.setVisibility(View.VISIBLE);
                img10.startAnimation(fady);
            }
        }, 5000);






        //-------------GO ANIMATION-----------
        final Animation go = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img1.startAnimation(go);
                img1.setVisibility(View.GONE);
            }
        }, 7000);
        final Animation go1 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img2.startAnimation(go1);
                img2.setVisibility(View.GONE);
            }
        }, 7200);

        final Animation go2 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img3.startAnimation(go2);
                img3.setVisibility(View.GONE);
            }
        }, 7400);

        final Animation go3 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img5.startAnimation(go3);
                img5.setVisibility(View.GONE);
            }
        }, 7600);

        final Animation go4 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img6.startAnimation(go4);
                img6.setVisibility(View.GONE);
            }
        }, 7800);

        final Animation go5 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img7.startAnimation(go5);
                img7.setVisibility(View.GONE);
            }
        }, 8000);

        final Animation go6 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img8.startAnimation(go6);
                img8.setVisibility(View.GONE);
            }
        }, 8200);

        final Animation go7 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img9.startAnimation(go7);
                img9.setVisibility(View.GONE);
            }
        }, 8400);

        final Animation go8 = AnimationUtils.loadAnimation(this, R.anim.topbottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                img10.startAnimation(go8);
                img10.setVisibility(View.GONE);
            }
        }, 8600);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompatSecond.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class MyGestureListenerSecond implements GestureDetector.OnGestureListener {
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

            if(event1.getX() < event2.getX()){
                                Intent intent = new Intent(
                        Main2Activity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_right_out, R.anim.slide_right_in);

            }

            else if(event1.getX() > event2.getX()){

                Intent intent = new Intent(
                        Main2Activity.this, Main3Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);

            }
            return true;
        }
    }
}
