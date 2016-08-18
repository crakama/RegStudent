package com.crakama.admin.regstudent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Double myLatitude = 44.433106;
    Double myLongitude = 26.103687;
    String labelLocation = "Jorgesys @ Bucharest";
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

        Button buttonmap = (Button)findViewById(R.id.buttonViewMaps);
        buttonmap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                viewMap(v);
            }
        });


        /////

        Button btnSelectCourse = (Button)findViewById(R.id.buttonCourse);
        btnSelectCourse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viewcourse){
                selectCourse( viewcourse);
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


    ///
    public void selectCourse(View viewcourse){

        Intent selectcourseIntent = new Intent(getApplicationContext(), ViewCourseActivity.class);
        startActivity(selectcourseIntent);


    }

    public void viewMap(View v){
        String urlAddress = "http://maps.google.com/maps?q="+ myLatitude  +"," + myLongitude +"("+ labelLocation + ")&iwloc=A&hl=es";
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
        startActivity(mapIntent);
    }

}
