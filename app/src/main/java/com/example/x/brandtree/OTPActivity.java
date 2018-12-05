package com.example.x.brandtree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class OTPActivity extends AppCompatActivity {

    String[] n = {"1","2","3","4","5","6","7","8","9","back","0","ok"};
    TextView tv;
    String st;
    double r = 0,num=10,t,p=0,tm;
    int v,temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        final GridView g = (GridView) findViewById(R.id.gridView);
        tv = (TextView) findViewById(R.id.textView16);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,n);
        g.setAdapter(ad);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = g.getItemAtPosition(i).toString();


                if (s.compareTo("back")!=0) {
                    temp = Integer.parseInt(s);
                    if (r == 0) {
                        p = p + temp;
                        v = (int) p;
                        r++;
                        st=Integer.toString(v);
                    } else if (r >= 1) {
                        p = num * p;
                        p = p + temp;
                        v = (int) p;
                        r++;
                        st=Integer.toString(v);
                    }
                }

                else if (s.compareTo("back")==0){

                    tm = p;
                    v = (int) tm;
                    v = v / 10;
                    r--;
                    p = v;
                    if(v>=1) {
                        st=Integer.toString(v);

                    }
                    else if (v==0){
                        st = "";
                    }
                }
                tv.setText(st);




                //Toast.makeText(GridActivity.this,g.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
