package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main8Activity extends AppCompatActivity   {
    EditText editLoginId, editLoginPass;
    Button btnLogin1;
    SQLiteDatabase sqdb1;
    SQLiteHelper sqh1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        editLoginId = (EditText) findViewById(R.id.email);
        editLoginPass = (EditText) findViewById(R.id.password);
        btnLogin1 = (Button) findViewById(R.id.btnAdd);

        sqh1 = new SQLiteHelper(this);

        sqdb1 = sqh1.getWritableDatabase();

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editLoginId.getText().toString().trim().length() == 0 ||
                        editLoginPass.getText().toString().trim().length() == 0) {
                    showMessage("Error", "Please enter LoginID & Password ");
                    return;
                }

                String[] params = new String[]{editLoginId.getText().toString(),editLoginPass.getText().toString()};

                Cursor c = sqdb1.rawQuery("SELECT * FROM " + SQLiteHelper.TABLE_NAME + " WHERE email=? and pass=?", params);
                if (c.moveToFirst()) {

                    showMessage("Hello","Login Successful");
                    clearText();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                   // i.putExtra("username",editLoginId.getText().toString());
                    i.putExtra("username","editLoginId");
                    startActivity(i);
                }
                else {
                    showMessage("Error", "Invalid LoginId or PAssword");
                    clearText();
                }
            }
        });
    }

    public  void showMessage(String titel,String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(titel);
        builder.setMessage(message);
        builder.show();
    }

    public void clearText()
    {
        editLoginPass.setText("");
        editLoginId.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sqdb1.close();
        sqh1.close();
    }
}
