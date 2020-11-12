package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton1 = (Button)findViewById(R.id.MyButton01); //用findViewById获取Button控件的id
        Button myButton2 = (Button)findViewById(R.id.button02); //用findViewById获取Button控件的id
        Button myButton3 = (Button)findViewById(R.id.button03); //用findViewById获取Button控件的id
        Button myButton4 = (Button)findViewById(R.id.button04); //用findViewById获取Button控件的id

//        myButton.setText("请点击！跳转界面");                    //设置Button控件上的Text

        myButton1.setOnClickListener(new wang(1)); //绑定当前的Button
        myButton2.setOnClickListener(new wang(2)); //绑定当前的Button
        myButton3.setOnClickListener(new wang(3)); //绑定当前的Button
        myButton4.setOnClickListener(new wang(4)); //绑定当前的Button

    }

    class wang implements android.view.View.OnClickListener {  //构造一个内部类，并用Intent对象进行跳转

        private Integer integer;
        Class c;

        public wang(Integer integer) {
            this.integer = integer;
        }

        public void onClick(View v){

            if (integer == 1){
                c = otherActivity01.class;
            }
            if (integer == 2){
                c = otherActivity02.class;
            }
            if (integer == 3){
                c = otherActivity03.class;
            }
            if (integer == 4){
                c = otherActivity04.class;
            }

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, c);//从当前activity跳转到另一个activity
            MainActivity.this.startActivity(intent);

        }

    }
}