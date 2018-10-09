package com.example.admin.location;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExampleDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sample_db";
    private static final String TABLE_NAME = "LoginDetails";
    public static final String NAME = "LATI";
    public static final String NAME1= "LONGI";
    public ExampleDB(Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "("
                + NAME + " TEXT,"
                + NAME+ " TEXT"+
                ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void sendValuesTODB(double lat, double lon) {
        SQLiteDatabase sqLiteDatabase =getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, lat);
        contentValues.put(NAME1, lon);

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
    }
    }

