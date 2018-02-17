package com.example.atul_.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by atul_ on 17/02/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "OrderDetail.db";
    public static final String TABLE_NAME = "Order";
    public static final String COL_1 = "ProductId";
    public static final String COL_2 = "ProductName";
    public static final String COL_3 = "Quantity";
    public static final String COL_4 = "Price";
    public static final String COL_5 = "Discount";




    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table" + TABLE_NAME +" (ProductId INTEGER PRIMARY KEY AUTOINCREMENT,ProductName TEXT,Quantity INTEGER,Price INTEGER,Discount INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }
}
