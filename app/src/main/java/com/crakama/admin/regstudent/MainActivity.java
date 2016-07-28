package com.crakama.admin.regstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnreg = (Button)findViewById(R.id.btnReg);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerStudent(v);
            }
        });
    }

    public void registerStudent(View view){

        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);


    }


}
