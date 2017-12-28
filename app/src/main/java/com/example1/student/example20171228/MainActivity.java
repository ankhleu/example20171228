package com.example1.student.example20171228;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        TextView tv;
    public void click1(View v)
    {
        //TextView tv;
     //   tv=(TextView) findViewById(R.id.textView);
        tv=findViewById(R.id.textView);
        tv.setText("歡迎光臨您好");
    }

    public void click2(View v)
    {
        EditText ed=findViewById(R.id.editText);
        Intent it=new Intent(MainActivity.this,SecActivity.class);
       // it.putExtra("data","my value");
        it.putExtra("data",ed.getText().toString());
        startActivity(it);
    }

}
