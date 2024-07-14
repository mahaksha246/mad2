package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity{
    TextView receiver_name_id;
    TextView receiver_usn_id;
    TextView receiver_collegeName_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        receiver_name_id = findViewById(R.id.receiver_name_id);
        receiver_usn_id = findViewById(R.id.receiver_usn_id);
        receiver_collegeName_id =
                findViewById(R.id.receiver_collegeName_id);
        Intent intent = getIntent();
        String strName = intent.getStringExtra("name");
        receiver_name_id.setText(strName);
        String strUsn = intent.getStringExtra("usn");
        receiver_usn_id.setText(strUsn);
        String strCollegeName = intent.getStringExtra("collegeName");
        receiver_collegeName_id.setText(strCollegeName);
    }
}