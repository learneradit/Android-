package com.example.database_storing;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    // Global variables:
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=openOrCreateDatabase("MyDatabase",MODE_PRIVATE,null);
        db.execSQL("Create Table if not exists Mytable(Roll int,Marks int);");
        ((Button)findViewById(R.id.Button_get)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowRecords();
            }
        });

        ((Button)findViewById(R.id.InsertRandomRecord)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertRandomRecord();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("ResourceType")
    public void InsertRandomRecord()
    {
        Random r=new Random();

        CharSequence roll;
        int marks;

        roll=getText(R.id.editText);
        marks=r.nextInt(100);

        db.execSQL("Insert into myTable Values(" +  roll+","+Integer.toString(marks)+");");
        //Record Inserted
    }
    public void ShowRecords()
    {
        Cursor c;
        int temp;
        String data;
        data="";
        c=db.rawQuery("Select * from MyTable;",null);
        c.moveToFirst();
        for(int i=0;c.moveToPosition(i);i++)
        {
            temp=c.getInt(0);       // column index = 0 i.e.roll no
            data+=Integer.toString(temp);
            temp=c.getInt(1);       // column index = 1 i.e. marks
            data+=" "+ Integer.toString(temp)+"\n";
        }


        ((TextView)findViewById(R.id.TextView_Records)).setText(data);
    }

}
