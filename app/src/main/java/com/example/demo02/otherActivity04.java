package com.example.demo02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class otherActivity04 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Mytext = (TextView)findViewById(R.id.MyText);
        Button myButton = (Button)findViewById(R.id.button04); //该activity中的操作和上面activity一样，不再赘述
        myButton.setText("点击返回");
        Mytext.setText(R.string.page4);
        myButton.setOnClickListener(new lios());
    }

    class lios implements OnClickListener{

        public void onClick(View v){

            Intent intent = new Intent();
            intent.setClass(otherActivity04.this,MainActivity.class);
            otherActivity04.this.startActivity(intent);
        }
    }
}