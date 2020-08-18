package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.intentsproj.R.id;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.example.intentsproj.example.EXTRA_NUMBER";

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtNum1 = findViewById(R.id.txtValue1);
        txtNum1.setText(R.string.value1);

        final EditText inputnum1 =findViewById(R.id.Inputnum1);
        inputnum1.setHint(R.string.Inputvalue1);

        TextView txtNum2 = findViewById(R.id.txtValue2);
        txtNum2.setText(R.string.value2);

        EditText inputnum2 =findViewById(R.id.inputnum2);
        inputnum2.setHint(R.string.Inputvalue2);

        TextView ButtonUser = findViewById(R.id.btnOK);
        ButtonUser.setText(R.string.buttonOK);

        Button button =(Button)findViewById(id.btnOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSecondActivity();
            }
        });



        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();


    }

    public void openSecondActivity(){


        EditText editnum1 = (EditText) findViewById(id.Inputnum1);
        int number1 =Integer.parseInt(editnum1.getText().toString());

        EditText editnum2 = (EditText) findViewById(id.inputnum2);
        int number2 =Integer.parseInt(editnum2.getText().toString());

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER,number1);
        intent.putExtra(EXTRA_NUMBER,number2);
        startActivity(intent);
    }
}