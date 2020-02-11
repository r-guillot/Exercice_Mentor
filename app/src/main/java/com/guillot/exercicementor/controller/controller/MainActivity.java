package com.guillot.exercicementor.controller.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.guillot.exercicementor.R;

public class MainActivity extends AppCompatActivity {
    private EditText mTypeEmail;
    private EditText mTypePassword;
    private Button mLoginBtn;
    private TextView mUnderline;

    private String mGoodEmail = "Admin@admin.com";
    private String mGoodPassword = "Admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTypeEmail = findViewById(R.id.blank_email);
        mTypePassword = findViewById(R.id.blank_password);
        mLoginBtn = findViewById(R.id.login_button);
        mUnderline= findViewById((R.id.sign_up_txt));

        mUnderline.setPaintFlags(mLoginBtn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        mUnderline.setText("Sign Up for Facebook");





        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmailInput = mTypeEmail.getText().toString();

                String getPasswordInput = mTypePassword.getText().toString();

                Intent listActivity = new Intent(MainActivity.this, ListActivity.class);
                AlertDialog.Builder wrongID = new AlertDialog.Builder (MainActivity.this);

                if (!getEmailInput.equals(mGoodEmail) || !getPasswordInput.equals(mGoodPassword)) {
                    wrongID.setTitle("Wrong EMAIL or Password !")
                            .setMessage("Please try again !")
                            .setPositiveButton("OK", null)
                            .create()
                            .show();
                } else {
                    startActivity(listActivity);
                }
            }
        });


    }
}
