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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import javax.microedition.khronos.opengles.GL10;

public class Main3Activity extends AppCompatActivity {
    private GestureDetectorCompat gestureDetectorCompatThird;;
    ImageView imgv1,imgv2;
    Button btn,btn1;
    TextView tv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        gestureDetectorCompatThird = new GestureDetectorCompat(this, new MyGestureListenerThird());
        imgv1 = (ImageView)findViewById(R.id.imageView14);
        imgv2 = (ImageView)findViewById(R.id.imageView15);
        btn = (Button)findViewById(R.id.button);
        btn1 = (Button)findViewById(R.id.button1);
        tv = (TextView)findViewById(R.id.textView);
        tv1 = (TextView)findViewById(R.id.textView2);

        imgv2.setVisibility(View.GONE);
        btn.setVisibility(View.GONE);
        btn1.setVisibility(View.GONE);
        tv1.setVisibility(View.GONE);
    }


    @Override
    protected void onStart() {
        super.onStart();

        final Animation txtanim = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                tv.startAnimation(txtanim);
                tv.setVisibility(View.GONE);
            }
        }, 2000);


        final Animation hide = AnimationUtils.loadAnimation(this, R.anim.rbottomtop);


        final Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clanim);

        final Animation banimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.banim);

        final Animation lanimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.loganim);



        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                imgv1.startAnimation(hide);
                imgv2.setVisibility(View.VISIBLE);
                imgv2.startAnimation(animation1);
                btn.setVisibility(View.VISIBLE);
                btn.startAnimation(banimation);
                tv1.setVisibility(View.VISIBLE);
                tv1.startAnimation(lanimation);
                btn1.setVisibility(View.VISIBLE);
                btn1.startAnimation(lanimation);

            }
        }, 3000);



    }

    public  void  login(View view){
        Intent i = new Intent(this.getApplicationContext(),Login.class);
        startActivity(i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetectorCompatThird.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class MyGestureListenerThird implements GestureDetector.OnGestureListener {
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
                        Main3Activity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_right_out, R.anim.slide_right_in);
            }


//            if(event1.getX() > event2.getX()){
//
//                Toast.makeText(getBaseContext(),
//                        "Swipe right - finish()",
//                        Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(
//                        Main3Activity.this, Main2Activity.class);
//                startActivity(intent);
//                overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
//
//            }
            return true;
        }
    }
}
