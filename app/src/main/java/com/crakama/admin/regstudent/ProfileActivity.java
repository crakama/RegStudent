package com.crakama.admin.regstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button btnSelectContact = (Button)findViewById(R.id.buttonback);
        btnSelectContact.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                selectContact(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;}

    public void selectContact(View v){

        Intent contactIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(contactIntent);
    }

}
