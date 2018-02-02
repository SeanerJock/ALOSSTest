package com.tencent.alosstest;

import android.app.Activity;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.sdk.android.oss.internal.OSSAsyncTask;

import java.io.File;
import java.io.IOException;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/ossfile/user1.text";

        /*File file=new File(absolutePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*if(!file.exists()) {
            file.mkdir();

        }*/
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(absolutePath);
    }

}
