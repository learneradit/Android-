package com.example.password_manager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Student.db";
    public static final String TABLE_NAME="Student.table";
    public static final String COL_1="ID";
    public static final String COL_2="Username";
    public static final String COL_3 ="Password";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table"+ TABLE_NAME+"""(ID INTEGER PRIMARY KEY AUTOINCREMENT,USERNAME TEXT,PASSWORD TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists "+TABLE_NAME);
        db.execSQL("Drop lable if exits");
        onCreate(db);
    }
}
