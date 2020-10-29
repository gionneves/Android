package app.guerreirosgames.cadastro;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasehelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ggadb";
    private static final String TABLE_NAME = "clientes";

    Databasehelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "create table" + TABLE_NAME + "(id INTEGER PRIMARY KEY, txt TEXT)";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean addText(String text) {
        //Get Writealbe DB
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
//Create ContentValues
        ContentValues contentValues = new ContentValues();
        contentValues.put("txt", text);
        //add values into DB
        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        return true;
    }
}
