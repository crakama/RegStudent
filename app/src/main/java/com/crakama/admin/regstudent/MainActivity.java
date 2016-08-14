package com.crakama.admin.regstudent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtfname = (EditText)findViewById(R.id.edittxtfname);
        final EditText txtlname =(EditText)findViewById(R.id.edittxtlname);
        Button btnreg = (Button)findViewById(R.id.btnReg);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(txtfname.getText().toString().trim().length()!= 0 && txtlname.getText().toString().trim().length()!= 0){
                                    registerStudent(v);

                }else{

                    txtfname.setText("");
                    txtlname.setText("");
                }
            }
        });


    }



    public void registerStudent(View view){

        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(intent);


    }


}
