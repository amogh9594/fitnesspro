package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class Main7Activity extends AppCompatActivity implements View.OnClickListener{
    EditText editId, editName, editEmail, editPass;
    Button btnReg, btnLogin;
    SQLiteDatabase sqdb;
    SQLiteHelper sqh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        editId = (EditText) findViewById(R.id.editLogid);
        editName = (EditText) findViewById(R.id.editName);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editPass = (EditText) findViewById(R.id.editPass);
        btnReg = (Button) findViewById(R.id.btnReg);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnReg.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

        sqh = new SQLiteHelper(this);

        sqdb = sqh.getWritableDatabase();

    }


    @Override
    public void onClick(View v) {


        if (v == btnReg) {
            if (editId.getText().toString().trim().length() == 0 ||
                    editName.getText().toString().trim().length() == 0 ||
                    editEmail.getText().toString().trim().length() == 0 ||
                    editPass.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter all values");
                return;
            }

            String insertQuery = "INSERT INTO " + SQLiteHelper.TABLE_NAME + " VALUES('" + Integer.parseInt(editId.getText().toString()) + "','" + editName.getText().toString() +
                    "','" + editEmail.getText().toString() + "','" + editPass.getText().toString() + "');";
            sqdb.execSQL(insertQuery);


            showMessage("Success", "Record added");
            Intent  i = new Intent(getApplicationContext(),Main8Activity.class);
            startActivity(i);
            clearText();

        } //End of Registration

        if (v == btnLogin) {

            Intent  i = new Intent(getApplicationContext(),Main8Activity.class);
            startActivity(i);

        }

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
        editId.setText("");
        editName.setText("");
        editEmail.setText("");
        editPass.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sqdb.close();
        sqh.close();
    }
}