package cn.example.com.recyclerviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private Handler handler =new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            //do something
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList mList=new ArrayList(10);
        mList.add(new Object());
        handler.postDelayed(new Runnable() {
            public void run() {
            }
        },1000*60);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(null);
    }
}
