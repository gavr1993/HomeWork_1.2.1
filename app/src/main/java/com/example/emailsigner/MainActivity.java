package com.example.emailsigner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEdtx;
    private EditText emailEdtx;
    private Button okBtn;
    private Button cleanBtn;
    private TextView resultTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameEdtx.getText().toString();
                String email = emailEdtx.getText().toString();
                String result = "  Подписка на рассылку успешно оформлена для пользователя "
                        +username+" на электронный адрес"+email;
                resultTxt.setText(result);
            }
        });
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameEdtx.getText().clear();
                emailEdtx.getText().clear();
            }
        });

    }

    private void init()  {
        usernameEdtx = findViewById(R.id. usernameEdtx);
        emailEdtx = findViewById(R. id. emailEdtx);
        okBtn = findViewById(R. id. okBtn);
        cleanBtn = findViewById(R. id. cleanBtn);
        resultTxt = findViewById(R. id. resultTxt);
    }

}
