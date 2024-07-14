package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText usn;
    EditText collegeName;
    Button sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        usn = findViewById(R.id.usn);
        collegeName = findViewById(R.id.collegeName);
        sendBtn = findViewById(R.id.SendData);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strName=name.getText().toString();
                String strUsn=usn.getText().toString();
                String strCollegeName=collegeName.getText().toString();
                Intent intent =new Intent(getApplicationContext(),
                        SecondActivity.class);
                intent.putExtra("name",strName);
                intent.putExtra("usn",strUsn);
                intent.putExtra("collegeName",strCollegeName);
                startActivity(intent);
            }
        });
    }
}
