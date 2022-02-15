package com.example.myapplicationfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

String arr[]= {"One","Two","Three"};
ListView firslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User Text value
        EditText UserText = (EditText)findViewById(R.id.Username);
        String Value = UserText.getText().toString();

        //Button
        Button Continuebutton = (Button) findViewById(R.id.Continuebutton);
        Continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Value);
                Toast.makeText(getApplicationContext(),"BUTTON PRESSED",Toast.LENGTH_LONG ).show();

            }
        });
        firslist = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,R.layout.activity_main,arr);
        firslist.setAdapter(arrayAdapter);

        }
}