package com.example1.student.example20171228;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView tv2=findViewById(R.id.textView4);
        Intent it=getIntent();
        String str =it.getStringExtra("data");
        tv2.setText(str);

    }

}
