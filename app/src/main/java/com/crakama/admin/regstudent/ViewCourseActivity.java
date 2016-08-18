package com.crakama.admin.regstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewCourseActivity extends AppCompatActivity implements ListSelectionListener {

    public static String[] mTitleArray;
    public static String[] mDetailsArray;
    private CourseDetailsFragment mcourseDetailsFragment;
    private static final String TAG = "ViewCourseActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitleArray = getResources().getStringArray(R.array);
        mDetailsArray = getResources().getStringArray(R.array);
        setContentView(R.layout.dropdownspin);

        mcourseDetailsFragment = (CourseDetailsFragment) getFragmentManager().findFragmentById(R.id.)
    }


}
