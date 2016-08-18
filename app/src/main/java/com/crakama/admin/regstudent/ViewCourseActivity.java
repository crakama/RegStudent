package com.crakama.admin.regstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ViewCourseActivity extends AppCompatActivity implements CourseTitleFragment.CourseListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragmentcontainer);


    }

    @Override
    public void itemClicked(long id) {
   //This method is defined in the listener.
    }



}
