package com.crakama.admin.regstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import javax.swing.event.*;

public class ViewCourseActivity extends AppCompatActivity {

    public static String[] mTitleArray;
    public static String[] mDetailsArray;
    //private CourseDetailsFragment mcourseDetailsFragment;
    private CourseTitleFragment mcourseTitleFragment;
    private static final String TAG = "ViewCourseActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitleArray = getResources().getStringArray(R.array.Titles);
        mDetailsArray = getResources().getStringArray(R.array.Details);
        setContentView(R.layout.fragmentcontainer);

        mcourseTitleFragment = (CourseTitleFragment) getSupportFragmentManager().findFragmentById(R.id.coursetitles);

        /**
         * getting CourseDetailsFragment to display
         * details of a course here to check it’s working
         */

        mcourseTitleFragment.setCourse(1);
    }





}
