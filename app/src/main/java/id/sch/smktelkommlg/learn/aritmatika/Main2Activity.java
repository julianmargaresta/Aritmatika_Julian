package id.sch.smktelkommlg.learn.aritmatika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button btnjumlah, btnkurang, btnkali, btnbagi;
    EditText editawal, editkedua, edithasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnjumlah = findViewById(R.id.btnjumlah);
        btnkurang = findViewById(R.id.btnkurang);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        editawal = findViewById(R.id.editawal);
        editkedua = findViewById(R.id.editkedua);
        edithasil = findViewById(R.id.edithasil);
        btnjumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan();
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan();
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian();
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian();
            }
        });
    }

    private void operatorpenjumlahan() {
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int pejumlahan = angkaawal + angkakedua;
        edithasil.setText(pejumlahan + "");

    }

    private void operatorpengurangan() {
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int pengurangan = angkaawal - angkakedua;
        edithasil.setText(pengurangan + "");
    }

    private void operatorperkalian() {
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int perkalian = angkaawal * angkakedua;
        edithasil.setText(perkalian + "");
    }

    private void operatorpembagian() {
        double angkaawal = Double.parseDouble(editawal.getText().toString());
        double angkakedua = Double.parseDouble(editkedua.getText().toString());
        double pembagian = angkaawal / angkakedua;
        edithasil.setText(pembagian + "");
    }
}

