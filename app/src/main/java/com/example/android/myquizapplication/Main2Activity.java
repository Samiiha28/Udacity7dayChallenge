package com.example.android.myquizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    public String user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //Get the User's name

    public void getUser (View view) {

        EditText username = (EditText) findViewById(R.id.user);

        user = username.getText().toString();

        //   Toast toast = Toast.makeText(Register.this, "Hello " + user, Toast.LENGTH_LONG);

        // toast.show();

        Intent goHome = new Intent(this, MainActivity.class);
        goHome.putExtra("gotUser", user);

        startActivity(goHome);


    }
/*
    public void saveUser (String username){

        username = user;

        getUsername(username);

    }
    */



}


