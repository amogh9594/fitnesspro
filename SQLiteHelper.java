package com.example.myfirst;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLiteHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "student_database.db";

    private static final int DATABASE_VERSION = 1;


    public static final String TABLE_NAME = "stud_table";


    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String EMAIL = "email";

    public static final String PASS = "pass";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + ID + " INTEGER PRIMARY KEY," + NAME
                + " VARCHAR(25),"+ EMAIL +" VARCHAR(25),"+ PASS +" VARCHAR(15) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop Table If Exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        // CREATE NEW INSTANCE OF TABLE
        onCreate(db);

    }
}
