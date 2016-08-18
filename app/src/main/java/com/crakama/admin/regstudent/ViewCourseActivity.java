package com.crakama.admin.regstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import javax.swing.event.*;

public class ViewCourseActivity extends AppCompatActivity implements CourseTitleFragment.CourseListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragmentcontainer);


    }

    @Override
    public void itemClicked(long id) {
//The code to set the detail will go here
    }



}
