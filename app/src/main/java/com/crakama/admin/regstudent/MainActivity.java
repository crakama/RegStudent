package com.crakama.admin.regstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerStudent(View view){

        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);


    }


}
