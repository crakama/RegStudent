package com.crakama.admin.regstudent;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SelectCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


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
//        // Initialize the list view
//
//
//        //Map the drop down items(e.g colors in this case) to the textview(list_item)
//        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_item,R.id.lvtxtview,getResources().getStringArray(R.array.colors)));
////        ArrayAdapter<String> = new ArrayAdapter<String>(this, R.layout.list_item, R.id.lvtxtview,getResources().getStringArray(R.array.colors));
//
//        //Get the ListView
//        ListView lv = getListView();
//        lv.setTextFilterEnabled(true);
//
//        //Attach a listener to listen when an item is clicked
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parentlstView, View lvview, int position, long lng) {
//                Toast.makeText(getApplicationContext(),
//                               ((TextView) lvview).getText(),
//                                Toast.LENGTH_SHORT).show();
//            }
//        });
//




    }




}
