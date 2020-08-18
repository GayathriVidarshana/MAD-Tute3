package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);





        TextView txtdvalu1 = findViewById(R.id.Dvalue1);
        txtdvalu1.setText(R.string.DValue1);

        TextView txtdvalu2 = findViewById(R.id.Dvalue2);
        txtdvalu2.setText(R.string.DValue2);


        TextView Dtxtdval1 = findViewById(R.id.Disnum1);
        Dtxtdval1.setText(R.string.DisValue1);

        TextView Dtxtdval2 = findViewById(R.id.Disnum2);
        Dtxtdval2.setText(R.string.DisValue2);

        Intent intent =getIntent();
        int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        Dtxtdval1.setText("" + number1);
        Dtxtdval2.setText("" + number2);

        TextView result = findViewById(R.id.result);
        result.setText(R.string.Result);


        TextView btnAdd,btnRed,btnmulty,btnDiv;

        btnAdd =findViewById(R.id.btnadd);
        btnAdd.setText(R.string.Add);

        btnRed =findViewById(R.id.btnred);
        btnRed.setText(R.string.red);

        btnmulty =findViewById(R.id.btnmulty);
        btnmulty.setText(R.string.muly);

        btnDiv =findViewById(R.id.btndiv);
        btnDiv.setText(R.string.div);

    }
}