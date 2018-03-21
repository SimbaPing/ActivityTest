package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        // 增加的这个按钮点了之后发生些事情
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Toast 增加一个提示信息，点一下按钮提示，没毛病
//                Toast.makeText(FirstActivity.this, "You click Button 1",
//                Toast.LENGTH_SHORT).show();
                // 2. 显式 Intent，从第一页跳转到第二页，没毛病
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
                // 3. 隐式 Intent，跳转至浏览器打开网页，没毛病
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.baidu.com"));
//                startActivity(intent);
                // 4. 在程序中调用系统拨号界面，没毛病
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
                // 5.
                String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", data);
                startActivity(intent);
            }
        });
    }
}
