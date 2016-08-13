package com.crakama.admin.regstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_option);

        // Code for Spinner viewgroup
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, R.layout.dropdownspin);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentadapterView, View view, int pos, long l) {
                Toast.makeText(
                        parentadapterView.getContext(),
                        "The color is" + parentadapterView.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> parentadapterView) {

            }
        });

        // Code for listView viewgroup
        ListView lv = (ListView)findViewById(R.id.lvcourse);
//        ArrayAdapter<CharSequence> listAdapter = ArrayAdapter.createFromResource(this, R.array.colors, R.color.drop)
    }



}
